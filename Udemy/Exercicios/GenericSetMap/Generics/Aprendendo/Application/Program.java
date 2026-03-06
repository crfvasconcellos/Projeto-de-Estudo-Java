package GenericSetMap.Generics.Aprendendo.Application;

import GenericSetMap.Generics.Aprendendo.Services.PrintService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.println("How many values? ");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }


        ps.print();




    }
}
