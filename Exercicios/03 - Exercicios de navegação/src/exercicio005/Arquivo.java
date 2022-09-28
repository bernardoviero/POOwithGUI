package exercicio005;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

    public static ArrayList leitor(String nomeArq) throws IOException {
        String conteudo = "";
        String texto = "";
        ArrayList<String> lista = new ArrayList();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomeArq + ".txt"));
            while ((conteudo = br.readLine()) != null) {
                lista.add(conteudo);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }
}