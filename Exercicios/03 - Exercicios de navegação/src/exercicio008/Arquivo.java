package exercicio008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {
        private String nome;

    public Arquivo() {
        this.nome = nome;
    }

    public static ArrayList leitor(String nomeArq) throws IOException {
        String conteudo = "";
        ArrayList<String> listaContatos = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomeArq+".txt"));
            while ((conteudo = br.readLine()) != null) {
                listaContatos.add(conteudo);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return listaContatos;
    }

    public static void gravar(String texto1,String texto2, String texto3, String nomeArq) throws IOException {
        try {
            FileWriter writer = new FileWriter(nomeArq+".txt", true);
            writer.write(texto1+"\n"+texto2+"\n"+texto3+"\n");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
