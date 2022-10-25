package model;

public class Agendamentos {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionarios getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionarios funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private int id;
    private Funcionarios funcionarios;
    private String local;
    private String data;
    private String tipo;

    public Agendamentos(int id, Funcionarios funcionarios, String local, String data, String tipo) {
        this.id = id;
        this.funcionarios = funcionarios;
        this.local = local;
        this.data = data;
        this.tipo = tipo;
    }   
}
