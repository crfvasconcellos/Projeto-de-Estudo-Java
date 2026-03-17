package GenericSetMap.Generics.Delimitados.Application;

import GenericSetMap.Generics.Delimitados.Entities.Product;
import GenericSetMap.Generics.Delimitados.Services.CalculationService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            String[] fields = line.split(",");
            list.add(new Product(fields[0],Double.parseDouble(fields[1])));


        }

        Product x = CalculationService.max(list);
        System.out.println("Max: ");
        System.out.println(x);

    }
}
