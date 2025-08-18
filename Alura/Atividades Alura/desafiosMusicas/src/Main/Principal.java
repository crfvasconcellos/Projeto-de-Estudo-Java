package Main;

import Models.MinhasPreferidas;
import Models.Musica;
import Models.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Old Town Road");
        minhaMusica.setAutor("Lil Nas x");

        for (int i = 0; i < 1600    ; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 133; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Diario de um jovem Moderno");
        meuPodcast.setAutor("Tropia");

        for (int i = 0; i < 4322; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 101; i++) {
            meuPodcast.curte();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);



    }
}
