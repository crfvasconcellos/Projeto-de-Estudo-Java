package dev.claudio.devflix.principal;

import dev.claudio.devflix.models.Filme;
import dev.claudio.devflix.models.Serie;
import dev.claudio.devflix.models.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme(1970,"O poderoso chefão");
        meuFilme.avalia(9);
        Filme outroFilme = new Filme(2005,"As Branquelas");
        meuFilme.avalia(10);
        Filme filmeDoClaudio = new Filme(2003,"Dogville");
        meuFilme.avalia(9);

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


    }
}
