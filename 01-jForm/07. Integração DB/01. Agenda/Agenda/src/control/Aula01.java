package control;

import java.util.ArrayList;
import model.Funcionarios;
import model.dao;

public class Aula01 {

    public static void main(String[] args) {
        dao banco = new dao();
        
        ArrayList<Funcionarios> lista = banco.listarFuncionarios();
        
        for(int i=0; i < lista.size();i++){
            System.out.println("ID: "+lista.get(i).getID());
            System.out.println("Nome: "+lista.get(i).getNome());
            System.out.println("Email: "+lista.get(i).getEmail());
            System.out.println("Cargo: "+lista.get(i).getCargo());
        }
    }
}
