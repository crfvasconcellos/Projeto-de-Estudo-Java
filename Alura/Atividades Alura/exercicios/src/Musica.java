public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    double totalavalia;
    int numDeAvalicao;

    void showFicha(){
        System.out.println("\n"+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Ano de Lancamento: "+ anoDeLancamento);
    }

    void avaliarMusica(int nota){
        numDeAvalicao++;
        totalavalia += nota;
        avaliacao = totalavalia/numDeAvalicao;
        System.out.println("A avaliação da música é "+ avaliacao);
    }

}
