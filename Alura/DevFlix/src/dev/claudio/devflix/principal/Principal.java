package dev.claudio.devflix.principal;

import dev.claudio.devflix.calculo.CalculadoraDeTempoJava;
import dev.claudio.devflix.calculo.FiltroDeRecomendacao;
import dev.claudio.devflix.models.Episodio;
import dev.claudio.devflix.models.Filme;
import dev.claudio.devflix.models.Serie;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Filme meuFilme = new Filme(1970,"O poderoso chefão");
        meuFilme.setDuracao(180);


        meuFilme.exibirFicha();
        Filme outroFilme = new Filme(2005,"As Branquelas");

        outroFilme.setDuracao(140);


        CalculadoraDeTempoJava calculadora = new CalculadoraDeTempoJava();


        Serie gossipGirl = new Serie(2002,"Gossip Girl");

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


        Filme filmeDoClaudio = new Filme(2003,"Dogville");
        filmeDoClaudio.setDuracao(200);
        filmeDoClaudio.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filmeDoClaudio);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
        System.out.println("O primeiro filme da lista é " + listaDeFilmes.get(0).getNome());
        System.out.println("To STring do Filme: " + listaDeFilmes);





    }
}
