package Map.ContagemVotos.Program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("Exercicios/Map/ContagemVotos/Program/votos.csv"));
        String linha;

        Map<String,Integer> candidates = new HashMap<>();

        while ((linha = br.readLine()) != null){
            String[] dataline = linha.split(", ");
            String candidatename = dataline[0];
            Integer qtdvotes = Integer.parseInt(dataline[1]);

            if (candidates.containsKey(candidatename)){
                candidates.put(candidatename,candidates.get(candidatename) + qtdvotes);
            }
            else {
                candidates.put(candidatename,qtdvotes);
            }




        }
            for (String candidate : candidates.keySet()){
                System.out.println(candidate + ": " + candidates.get(candidate));
            }


    }
}
