package SummaryComFiles.src.Appplication;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class mainSummary {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = null;

        try{
            File arquivoEntrada = new File("Exercicios/SummaryComFiles/src/data/data.csv");
            sc = new Scanner(arquivoEntrada);

            try (BufferedWriter br = new BufferedWriter(new FileWriter("Exercicios/SummaryComFiles/src/out/summary.csv"))){
                while (sc.hasNext()){
                    String line = sc.nextLine();

                    String[] lineparts = line.split(",");

                    String nome = lineparts[0];
                    double preco = Double.parseDouble(lineparts[1]);
                    int quantidade = Integer.parseInt(lineparts[2]);

                    double precoTotal = preco * (double) quantidade;


                    String saida = String.format("%s,%.2f",nome,precoTotal);

                    br.write(saida);
                    br.newLine();

                }
            }
            catch (IOException e){
                e.printStackTrace();
            }



        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }






    }
}
