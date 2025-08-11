package dev.claudio.devflix.models;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double avaliacoes;
    private int totalDeAvaliacao;
    int duracao;


    public int getTotalDeAvaliacao(){
        return  totalDeAvaliacao;
    }

    public void exibirFicha(){
        System.out.println("Nome do dev.claudio.devflix.models.Filme: "+nome);
        System.out.println("Ano de Lançamento: "+anoDeLancamento);
        System.out.println("Duração: "+duracao+" min");
    }

    public void avalia(double nota){
        avaliacoes = avaliacoes + nota;
        totalDeAvaliacao++;
    }

    public double obtemMedia(){
        return avaliacoes/totalDeAvaliacao;
    }

}
