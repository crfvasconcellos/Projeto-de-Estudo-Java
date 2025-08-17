package dev.claudio.devflix.calculo;

import dev.claudio.devflix.models.Filme;
import dev.claudio.devflix.models.Serie;
import dev.claudio.devflix.models.Titulo;

public class CalculadoraDeTempoJava {
    private int tempototal = 0;

    public int getTempototal() {
        return this.tempototal;
    }

//    public void inclui(Filme f){
//        tempototal = f.getDuracao() + tempototal;
//    }
//
//    public void inclui(Serie s){
//        tempototal = s.getDuracao() + tempototal;
//    }

    public void inclui (Titulo t){
        tempototal = t.getDuracao() + tempototal;
    }
}
