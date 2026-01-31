package Polimorfismo.Fixacao.Entities;

public class Product {
    protected String name;
    protected  double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name + " $ " + this.price);
        return sb.toString();
    }


}
