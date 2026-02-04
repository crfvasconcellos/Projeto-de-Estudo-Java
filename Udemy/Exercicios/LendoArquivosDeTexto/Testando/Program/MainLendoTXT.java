package LendoArquivosDeTexto.Testando.Program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainLendoTXT {
    public static void main(String[] args) {

        File file = new File("Exercicios/LendoArquivosDeTexto/Testando/in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Não foi possível abrir o arquivo");
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }



    }
}
