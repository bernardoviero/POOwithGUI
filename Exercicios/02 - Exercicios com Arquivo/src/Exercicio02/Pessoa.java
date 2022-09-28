package Exercicio02;

public class Pessoa {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String nome;
    private String email;
    
    public String retornarEmail(String email){

        return this.email ="bernardo@gmail.com";
    }
}
