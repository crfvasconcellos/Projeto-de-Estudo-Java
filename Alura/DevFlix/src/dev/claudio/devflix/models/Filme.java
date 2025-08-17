package dev.claudio.devflix.models;

import dev.claudio.devflix.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
   private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) obtemMedia() / 2;
    }
}
