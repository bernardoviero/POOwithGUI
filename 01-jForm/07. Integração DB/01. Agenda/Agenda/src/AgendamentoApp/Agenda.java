package AgendamentoApp;

import control.FuncionarioController;
import control.TelaController;
import viewer.Cadastro;
import viewer.Exibir;
import viewer.Menu;

public class Agenda {

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Menu menu = new Menu();
        Exibir lista = new Exibir();
        FuncionarioController controller = new FuncionarioController(lista,cadastro);
        TelaController tc = new TelaController(cadastro, lista, menu);
        
        tc.initController();
        controller.initController();
        //lista.setVisible(true);
    }
}
