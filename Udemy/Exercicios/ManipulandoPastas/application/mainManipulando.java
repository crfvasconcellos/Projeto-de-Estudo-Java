package ManipulandoPastas.application;

import java.io.File;
import java.util.Scanner;

public class mainManipulando {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Coloque uma Pasta: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        boolean sucess = new File(strPath + "\\TesteManipulacaoDePastas").mkdir();
        System.out.println("Diretorio criado com sucesso: " + sucess);


        sc.close();


    }
}
