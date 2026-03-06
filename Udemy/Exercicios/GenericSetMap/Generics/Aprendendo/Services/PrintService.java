package GenericSetMap.Generics.Aprendendo.Services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    List<Integer> list = new ArrayList<>();

    public void addValue(Integer value){
        list.add(value);
    }

    public Integer first(){
        if (list.isEmpty()){
            throw new IllegalStateException("A lista está vazia!");
        }

        return list.getFirst();


    }

    public void print(){
        System.out.println(list);
        System.out.println("First: " + first());

    }



}
