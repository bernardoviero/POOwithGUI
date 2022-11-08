package model;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;

public class FuncionarioDAO {
    private Connection con;
    
    //select do banco de todos os funcionarios
    public ArrayList<Funcionarios> listarFuncionarios(){
        ArrayList<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();
        String read = "select * from Funcionarios;";
        try{
            con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(read);
            
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                int id = Integer.parseInt(rs.getString(1));
                String nome = rs.getString(2);
                String email = rs.getString(3);
                String cargo = rs.getString(4);
                
                listaFuncionarios.add(new Funcionarios(id,nome,email,cargo));
            }
            con.close();
            return listaFuncionarios;
            
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    //inserção de dados no banco de dados na tabela funcionarios
    public void inserirFuncionario(Funcionarios funcionarios){
        String insert = "INSERT INTO Funcionarios(DS_Nome,DS_Email,DS_Cargo)" +"values(?,?,?)";
        try{
            con = new ConnectionFactory().getConnection();
            PreparedStatement pst = con.prepareStatement(insert);
            
            pst.setString(1, funcionarios.getNome());
            pst.setString(2, funcionarios.getEmail());
            pst.setString(3, funcionarios.getCargo());
            pst.execute();
            
            con.close();
            pst.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    //editando os dados no banco de dados na tabela funcionarios
    public void editarFuncionario(Funcionarios funcionarios){
        String update = "UPDATE Funcionarios set DS_Nome = ?, DS_Email = ?, DS_Cargo = ?" +
                "where ID = ?;";
        con = new ConnectionFactory().getConnection();
        try{
            PreparedStatement pst = con.prepareStatement(update);
            pst.setString(1, funcionarios.getNome());
            pst.setString(1, funcionarios.getEmail());
            pst.setString(1, funcionarios.getCargo());
            pst.setString(1, funcionarios.getID()+"");
            
            pst.executeUpdate();
            con.close();
            pst.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    //excluir os dados no banco de dados na tabela funcionarios
    public void deletarFuncionario(Funcionarios funcionarios){
        String delete = "DELETE FROM Funcionarios WHERE ID = ?;";
        con = new ConnectionFactory().getConnection();
        try{
            PreparedStatement pst = con.prepareStatement(delete);
            pst.setString(1, funcionarios.getID()+"");
            
            pst.execute();
            con.close();
            pst.close();
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
