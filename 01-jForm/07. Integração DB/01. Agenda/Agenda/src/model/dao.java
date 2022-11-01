package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;

public class dao {
    private String url = "jdbc:mysql://localhost:3306/aula03_agendamento";
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "laboratorio";
    
    private Connection conectar(){
        Connection com = null;
        try{
            Class.forName(driver);
            com = DriverManager.getConnection(url, user, password);
            return com;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    } 
    
    public ArrayList<Funcionarios> listarFuncionarios(){
        ArrayList<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();
        String read = "select * from Funcionarios;";
        try{
            Connection con = conectar();
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
    public void inserirFuncionario(Funcionarios funcionarios){
        String insert = "INSERT INTO Funcionarios(DS_Nome,DS_Email,DS_Cargo)" +"values(?,?,?)";
        try{
            Connection con = conectar();
            PreparedStatement pst = con.prepareStatement(insert);
            
            pst.setString(1, funcionarios.getNome());
            pst.setString(2, funcionarios.getEmail());
            pst.setString(3, funcionarios.getCargo());
            pst.execute();
            
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
