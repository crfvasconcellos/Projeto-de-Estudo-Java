public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double avaliacoes;
    private int totalDeAvaliacao;
    int duracao;


    int getTotalDeAvaliacao(){
        return  totalDeAvaliacao;
    }

    void exibirFicha(){
        System.out.println("Nome do Filme: "+nome);
        System.out.println("Ano de Lançamento: "+anoDeLancamento);
        System.out.println("Duração: "+duracao+" min");
    }

    void avalia(double nota){
        avaliacoes = avaliacoes + nota;
        totalDeAvaliacao++;
    }

    double obtemMedia(){
        return avaliacoes/totalDeAvaliacao;
    }

}
