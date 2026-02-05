package LendoArquivosDeTexto.FileBuffle.Program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramWriter {
    public static void main(String[] args) {

        String path = "Exercicios/LendoArquivosDeTexto/FileBuffle/Program/in.txt";

        try(BufferedWriter br = new BufferedWriter(new FileWriter(path,true))) {


            br.newLine();
            br.write("Good Morning");
            br.newLine();
            br.write("Good Afternoon");
            br.newLine();
            br.write("Good Night");


        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }



    }
}
