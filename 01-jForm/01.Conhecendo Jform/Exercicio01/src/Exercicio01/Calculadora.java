package Exercicio01;

public class Calculadora {

    public int getValor1() {
        return valor1;
    }
    
    public Calculadora(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    private int valor1;
    private int valor2;

    public int soma(int v1, int v2) {
        return v1 + v2;
    }

    public int subtracao(int v1, int v2) {
        return v1 - v2;
    }

    public int multiplicacao(int v1, int v2) {
        return v1 * v2;
    }

    public int divisao(int v1, int v2) {
        return v1 / v2;
    }
}
