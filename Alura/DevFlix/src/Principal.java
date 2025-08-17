import dev.claudio.devflix.calculo.CalculadoraDeTempoJava;
import dev.claudio.devflix.calculo.FiltroDeRecomendacao;
import dev.claudio.devflix.models.Episodio;
import dev.claudio.devflix.models.Filme;
import dev.claudio.devflix.models.Serie;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracao(180);


        meuFilme.exibirFicha();
        Filme outroFilme = new Filme();

        outroFilme.setNome("As Branquelas");
        outroFilme.setAnoDeLancamento(2005);
        outroFilme.setDuracao(140);


        CalculadoraDeTempoJava calculadora = new CalculadoraDeTempoJava();


        Serie gossipGirl = new Serie();

        gossipGirl.setNome("Gossip Girl");
        gossipGirl.setTemporadas(6);
        gossipGirl.setMinutosPorEpisodio(40);
        gossipGirl.setEpsPorTemporada(24);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(gossipGirl);
        episodio.setTotalAvaliacoes(2);



        calculadora.inclui(outroFilme);
        calculadora.inclui(meuFilme);
        calculadora.inclui(gossipGirl);

        System.out.println(calculadora.getTempototal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(episodio);



    }
}
