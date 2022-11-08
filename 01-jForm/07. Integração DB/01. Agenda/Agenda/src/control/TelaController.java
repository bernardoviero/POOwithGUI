package control;

import viewer.Cadastro;
import viewer.Exibir;
import viewer.Menu;

public class TelaController {
    private Cadastro cadastro;
    private Exibir lista;
    private Menu menu;
    
    public TelaController(Cadastro cadastro, Exibir lista, Menu menu){
        this.cadastro = cadastro;
        this.lista = lista;
        this.menu = menu;
    }
    
    public void initController(){
        menu.setVisible(true);
        lista.setVisible(false);
        
        menu.getjButton_cadastro().addActionListener(e-> exibirTelaCadastro());
        
        cadastro.getjButton_retornar().addActionListener(e-> exibirTelaMenu());
    }
    
    private void exibirTelaCadastro(){
        
        menu.setVisible(false);
        cadastro.setVisible(true);
        lista.setVisible(false);
        
        cadastro.getjButton_salvar().addActionListener(e-> exibirTelaListagem());
    }
    
    private void exibirTelaMenu(){
        menu.setVisible(true);
        cadastro.setVisible(false);
    }
    
    private void exibirTelaListagem(){

        lista.setVisible(true);
        cadastro.setVisible(false);
    }
}
