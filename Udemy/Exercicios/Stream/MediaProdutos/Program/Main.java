package Stream.MediaProdutos.Program;

import Stream.MediaProdutos.Entites.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> produtos = new ArrayList<>();

        try{
            FileReader fr = new FileReader("Exercicios/Stream/MediaProdutos/Data/products.csv");
            BufferedReader br = new BufferedReader(fr);

            String linha;

            while ((linha = br.readLine()) != null){

                String[] vect = linha.split(",");
                produtos.add(new Product(vect[0], Double.parseDouble(vect[1])));

            }

            br.close();
            fr.close();

        }
        catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double media = 0;

        for (Product p : produtos){

            media = media + p.getPrice();


        }

        media = media / produtos.stream().count();
        System.out.println("Media: " + media);


    }
}
