package dev.claudio.devflix.principal;

import dev.claudio.devflix.models.Filme;
import dev.claudio.devflix.models.Serie;
import dev.claudio.devflix.models.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme(1970,"O poderoso chefão");
        meuFilme.avalia(9);
        Filme outroFilme = new Filme(2005,"As Branquelas");
        outroFilme.avalia(10);
        Filme filmeDoClaudio = new Filme(2003,"Dogville");
        filmeDoClaudio.avalia(9);

        Serie gossipGirl = new Serie(2002,"Gossip Girl");

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(filmeDoClaudio);
        lista.add(outroFilme);
        lista.add(gossipGirl);


        for (Titulo t : lista){

            System.out.println(t.getNome());

            if (t instanceof Filme filme){
                System.out.println(filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Lil nas X");
        buscaPorArtista.add("Anitta");
        buscaPorArtista.add("Chico Buarque");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println(buscaPorArtista);

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);


    }
}
