package Polimorfismo.Fixacao.Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    private Date manufactureDate;

    public UsedProduct(String name, double price, String manufactureDate) throws ParseException {
        super(name, price);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.manufactureDate = sdf.parse(manufactureDate);

    }


    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(this.name).append(" (used) ").append(" $ ").append(this.price).append(" (Manufacture date: ").append(sdf.format(this.manufactureDate)).append(")");
        return sb.toString();
    }



}
