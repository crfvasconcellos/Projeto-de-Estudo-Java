package Polimorfismo.Fixacao.Entities;

public class ImportedProduct extends Product{

    private final double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        double total = this.price + customsFee;
        return total;
    }


    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        double total = totalPrice();
        sb.append(this.name).append(" $ ").append(total).append(" ( Customs fee: $ ").append(customsFee).append(')');
        return sb.toString();
    }



}
