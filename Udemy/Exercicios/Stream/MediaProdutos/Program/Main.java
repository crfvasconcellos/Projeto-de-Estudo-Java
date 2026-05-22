package Stream.MediaProdutos.Program;

import Stream.MediaProdutos.Entites.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        double media = produtos.stream().map(p -> p.getPrice()).reduce(0.0,(x,y) -> x + y) / produtos.size();


        System.out.println("Media: " + String.format("%.2f",media));

        Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

        List<String> menores = produtos.stream()
                .filter(p -> p.getPrice() < media)
                .map(p -> p.getName())
                .sorted(comp.reversed()).collect(Collectors.toList());


        for (String p : menores){
            System.out.println(p);
        }


    }
}
