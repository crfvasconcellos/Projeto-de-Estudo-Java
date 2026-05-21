package InterfaceFuncional.Predicate.RecebendoPropriosPredicados;

import InterfaceFuncional.Predicate.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {


    public double filteredSum(List<Product> list, Predicate<Product> criterio){
        double soma = 0.0;

        for (Product p : list){
            if (criterio.test(p)){
                soma = soma + p.getPrice();
            }
        }

        return soma;

    }








}
