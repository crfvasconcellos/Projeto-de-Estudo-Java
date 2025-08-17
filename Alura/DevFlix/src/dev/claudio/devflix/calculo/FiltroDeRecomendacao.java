package dev.claudio.devflix.calculo;

public class FiltroDeRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao()>=4){
            System.out.println("Esta entre os preferidos do Momento");
            
        } else if (classificavel.getClassificacao()>=2) {
            System.out.println("Muito Bem avaliado no Momento!");
            
        }
        else {
            System.out.println("Assista Depois!");
        }

    }
}
