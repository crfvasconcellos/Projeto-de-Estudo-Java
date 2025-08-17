package dev.claudio.devflix.models;

import dev.claudio.devflix.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalAvaliacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalAvaliacoes> 1000){
            return 4;
        } else if (totalAvaliacoes>500) {
            return 2;
        } else {
            return 1;
        }
    }
}
