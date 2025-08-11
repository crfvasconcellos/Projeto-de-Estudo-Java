package dev.claudio.devflix.models;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacoes;
    private int totalDeAvaliacao;
    private int duracao;


    public int getTotalDeAvaliacao(){
        return  totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
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
