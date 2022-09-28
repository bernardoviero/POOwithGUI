package newpackage2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {

    private String nome;

    public Arquivo() {
        this.nome = nome;
    }

    public Arquivo(String nome) {
        this.nome = nome;
    }
    
    public void gravar(String texto, String nome){
        
    }

    public static String leitor() throws IOException {
        String conteudo = "";
        String texto = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
            while ((conteudo = br.readLine()) != null) {
                texto = texto +"\n"+ conteudo;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return texto;
    }

    public static void gravar(String texto) throws IOException {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo.txt"));
            bw.write(texto);
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
