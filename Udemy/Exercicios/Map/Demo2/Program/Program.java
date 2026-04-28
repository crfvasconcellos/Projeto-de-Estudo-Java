package Map.Demo2.Program;

import Map.Demo2.Entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Map<Product,Double> cookies = new HashMap<>();

        Product p1 = new Product("Tv",900);
        Product p2 = new Product("Notebook",1200);
        Product p3 = new Product("Tablet",400.0);

        cookies.put(p1,10000.0);
        cookies.put(p2,20000.0);
        cookies.put(p3,15000.0);
        
        Product ps = new Product("Tv",900);

        System.out.println("Contains 'ps' key : " + cookies.containsKey(ps));



    }
}
