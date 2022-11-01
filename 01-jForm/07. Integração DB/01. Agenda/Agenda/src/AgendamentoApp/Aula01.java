package AgendamentoApp;

import control.Controller;
import java.util.ArrayList;
import model.Funcionarios;
import model.dao;
import viewer.Cadastro;
import viewer.Exibir;
import viewer.Menu;

public class Aula01 {

    public static void main(String[] args) {
        
        Controller controller = new Controller(new Menu(), new Cadastro(), new Exibir());
        
        controller.initController();
    }
        /*
        dao banco = new dao();

        ArrayList<Funcionarios> lista = banco.listarFuncionarios();
        banco.inserirFuncionario(new Funcionarios(0,"Jair Messias", "mito@gmail.com", "presidente"));
        banco.inserirFuncionario(new Funcionarios(0, "Luis Inacio", "lula@gmail.com", "ex-presidente"));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("ID: " + lista.get(i).getID());
            System.out.println("Nome: " + lista.get(i).getNome());
            System.out.println("Email: " + lista.get(i).getEmail());
            System.out.println("Cargo: " + lista.get(i).getCargo());
        }
    }*/
}
