package model;

public class Funcionarios {

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

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
    private int ID;
    private String nome;
    private String email;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    private String cargo;
    
    public Funcionarios(int ID, String nome, String email, String cargo){
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }
    
}
