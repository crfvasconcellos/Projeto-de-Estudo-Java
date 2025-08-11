public class TesteMusica {
    public static void main(String[] args) {
        Musica musc1 = new Musica();

        musc1.titulo = "Descobridor dos 7 mares";
        musc1.artista= "Tim Maia";
        musc1.anoDeLancamento= 1983;

        musc1.avaliarMusica(10);
        musc1.avaliarMusica(4);
    }
}
