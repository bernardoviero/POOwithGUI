import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
    
    public boolean registrar(Candidatos candidato) {
        try {
            FileWriter fileWriter = new FileWriter("banco.txt", true);
            fileWriter.write(candidato.getNome() + "," + candidato.getSobrenome() +
                    "," + candidato.getIdade()+ ","+candidato.getSexo()+","+ candidato.getCpf() + "," +
                    candidato.getCidade() +","+candidato.getEmail()+","
                    +candidato.getVagaDesejada()+","+candidato.getTelefone()+","
                    +candidato.getNacionalidade()+";"+"\n");
            fileWriter.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }  
}