import dev.claudio.devflix.models.Filme;
import dev.claudio.devflix.models.Serie;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Scanner leitor = new Scanner(System.in);
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracao(180);

        meuFilme.exibirFicha();

        System.out.println("Qual nota você daria?");
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(2);

        Serie minhaSerie = new Serie();

        minhaSerie.setNome("Gossip Girl");
        minhaSerie.setAnoDeLancamento(2007);
        minhaSerie.setTemporadas(6);
        minhaSerie.setMinutosPorEpisodio(40);
        minhaSerie.setEpsPorTemporada(24);





        minhaSerie.exibirFicha();
        

    }
}
