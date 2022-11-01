package control;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Funcionarios;
import model.dao;
import viewer.Cadastro;
import viewer.Exibir;
import viewer.Menu;

public class Controller {

    private Exibir exibir;
    private Menu menu;
    private Cadastro cadastro;
    private dao dao = new dao();
    private Funcionarios funcionarios;
    private ArrayList<Funcionarios> listaFuncionarios;

    public Controller(Menu menu, Cadastro cadastro, Exibir exibir) {
        this.menu = menu;
        this.cadastro = cadastro;
        this.exibir = exibir;
    }

    public void initController() {
        menu.setVisible(true);
        menu.getjButton_cadastro().addActionListener(e -> exibirTelaCadastro());
        cadastro.getjButton_salvar().addActionListener(e -> salvarFuncionario());
    }

    private void exibirTelaCadastro() {
        cadastro.setVisible(true);
        menu.setVisible(false);
        cadastro.getjButton1().addActionListener(e -> exibirTelaMenu());
        cadastro.getjButton_visualizar().addActionListener(e -> exibirTelaVisualizacao());
        exibir.setVisible(false);
    }

    private void exibirTelaMenu() {
        cadastro.setVisible(false);
        menu.setVisible(true);
    }

    private void salvarFuncionario() {
        dao.inserirFuncionario(new Funcionarios(0, cadastro.getjTextField_nome().getText(), cadastro.getjTextField_email().getText(), cadastro.getjTextField_cargo().getText()));
    }

    private void exibirTelaVisualizacao() {
        exibir.getjButton_retornarCadastrar().addActionListener(e -> exibirTelaCadastro());
        cadastro.setVisible(false);
        exibir.setVisible(true);
        DefaultTableModel DefaultTableModel = null;
        DefaultTableModel model = ((DefaultTableModel) exibir.getjTable_exibicao().getModel());
        listaFuncionarios = dao.listarFuncionarios();
        model.setRowCount(0);
        for(int i=0; i<listaFuncionarios.size();i++){
            model.addRow(new Object[]{listaFuncionarios.get(i).getID(),listaFuncionarios.get(i).getNome(),listaFuncionarios.get(i).getEmail(),listaFuncionarios.get(i).getCargo()});
        }
        exibir.getjButton_fechar().addActionListener(e -> System.exit(0));
    }
}
