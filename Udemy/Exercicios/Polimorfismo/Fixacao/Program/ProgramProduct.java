package Polimorfismo.Fixacao.Program;

import Polimorfismo.Employers.Entities.Employee;
import Polimorfismo.Fixacao.Entities.ImportedProduct;
import Polimorfismo.Fixacao.Entities.Product;
import Polimorfismo.Fixacao.Entities.UsedProduct;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Número de produtos: ");
        int qtd = sc.nextInt();

        Product[] products = new Product[qtd];

        for (int i = 0; i < qtd; i++) {

            System.out.printf("Produto %dº ---- \n",i+1);
            System.out.println("Comum, usado ou importado? (c/u/i): ");
            sc.nextLine();
            char tipo = sc.nextLine().charAt(0);
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Preço: ");
            double preco = sc.nextDouble();

            switch (tipo){
                case 'c':
                    products[i] = new Product(nome,preco);
                    break;

                case 'u':
                    System.out.println("Data de uso (DD/MM/YYYY): ");
                    sc.nextLine();
                    String data = sc.nextLine();
                    products[i] = new UsedProduct(nome,preco,data);
                    break;

                case 'i':
                    System.out.println("Taxa de importação: ");
                    double taxa = sc.nextDouble();
                    products[i] = new ImportedProduct(nome,preco,taxa);
                    break;
            }


        }


        System.out.println("PRICE TAGS : ");
        for (Product p : products){
            System.out.println(p.priceTag());
        }





    }
}
