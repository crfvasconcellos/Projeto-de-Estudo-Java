package EstruturaDeDados.Listas;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Marcos");
        list.add("Vitor");
        list.add(1,"Claudio");

        for (String x : list){

            System.out.printf("\n%s",x);


        }

        System.out.printf("\nPosição do Vitor: %d ",list.indexOf("Vitor"));
        System.out.println("\n\nRemovendo M");
        list.removeIf(x -> x.charAt(0) == 'M' );

        for (String x : list){

            System.out.printf("\n%s",x);


        }

        System.out.printf("\nPosição do Vitor: %d ",list.indexOf("Vitor"));
    }
}
