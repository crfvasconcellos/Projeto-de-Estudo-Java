import java.util.Locale;
import java.util.Scanner;

public class Product {

    private String name;
    private double preco;
    private int qtd;

    public Product() {
    }

    public Product(String name, double preco, int qtd) {
        this.name = name;
        this.preco = preco;
        this.qtd = qtd;
    }

    public void addProducts(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products to be added in " +
                "stock: ");
        int quantity = sc.nextInt();
        this.qtd =this.qtd + quantity;

        System.out.println("Updated data = ");
        showData();

    }

    public void removeProducts(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products to be removed in " +
                "stock: ");
        int quantity = sc.nextInt();
        this.qtd = this.qtd - quantity;

        System.out.println("Updated data = ");
        showData();
    }

    public void setData(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter the Data ---- ");
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Price: ");
        this.preco = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        this.qtd = sc.nextInt();
    }


    public void showData(){
        System.out.println("--DADOS DA CONTA--");
        System.out.printf("\n Name = %s ", name);
        System.out.printf("\n Preço = %.2f ",preco);
        System.out.printf("\n Quantidade = %d ",qtd);
        double totalgasto = preco * (double) qtd;
        System.out.printf("\n Total = %.2f \n ",totalgasto);

    }


}
