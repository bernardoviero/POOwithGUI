package control;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.FuncionarioDAO;
import model.Funcionarios;
import viewer.Cadastro;
import viewer.Exibir;

public class FuncionarioController {

    private Exibir lista;
    private Cadastro cadastro;
    private FuncionarioDAO dao = new FuncionarioDAO();

    public FuncionarioController(Exibir lista, Cadastro cadastro) {
        this.lista = lista;
        this.cadastro = cadastro;
    }

    public void initController() {
        //listar os funcionarios
        lista.getjButton1().addActionListener(e -> listarFuncionarios());
        lista.getjButton_excluir().addActionListener(e -> deletarFuncionarios());
    }

    private void listarFuncionarios() {
        ArrayList<Funcionarios> listaDeFuncionarios = dao.listarFuncionarios();
        DefaultTableModel model = ((DefaultTableModel) lista.getjTable_exibicao().getModel());
        model.setRowCount(0);
        for (int i = 0; i < listaDeFuncionarios.size(); i++) {
            model.addRow(new Object[]{listaDeFuncionarios.get(i).getID(), listaDeFuncionarios.get(i).getNome(), listaDeFuncionarios.get(i).getEmail(), listaDeFuncionarios.get(i).getCargo()});
        }
    }
    //listar funcionarios

    //inserir os funcionarios
    void inserirFuncionarios() {
        String nome = cadastro.getjTextField_nome().getText();
        String email = cadastro.getjTextField_email().getText();
        String cargo = cadastro.getjTextField_cargo().getText();
        Funcionarios funcionario = new Funcionarios(0,nome,email,cargo);
        dao.inserirFuncionario(funcionario);
    }
    //atualizar os funcionarios

    //excluir os funcionarios
    private void deletarFuncionarios() {
        JTable tabela = lista.getjTable_exibicao();
        int linha = tabela.getSelectedRow();
        if (linha != -1) {
            int id = Integer.parseInt(tabela.getValueAt(linha, 0) + "");
            String nome = tabela.getValueAt(linha, 1) + "";
            String email = tabela.getValueAt(linha, 2) + "";
            String cargo = tabela.getValueAt(linha, 3) + "";
            Funcionarios funcionario = new Funcionarios(id, nome, email, cargo);
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "DELETAR FUNCIONÁRIO ?" + funcionario.toString());
            if (showConfirmDialog == 0) {
                dao.deletarFuncionario(funcionario);
                listarFuncionarios();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um funcionário válido !!");
        }
    }

}
