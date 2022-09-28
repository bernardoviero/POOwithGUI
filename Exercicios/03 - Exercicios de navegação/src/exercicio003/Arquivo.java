package exercicio003;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

    private String nome;

    public Arquivo() {
        this.nome = nome;
    }

    public Arquivo(String nome) {
        this.nome = nome;
    }

    public static ArrayList leitor(String nomeArq, int valorResto) throws IOException {
        String conteudo = "";
        String texto = "";
        ArrayList<String> lista = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomeArq + ".txt"));
            int contador = 0;
            while ((conteudo = br.readLine()) != null) {

                contador++;
                if (contador % 2 == valorResto) {
                    lista.add(conteudo);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }
}
