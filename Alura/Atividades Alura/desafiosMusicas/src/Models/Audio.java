package Models;

public class Audio {
    private String titulo;
    private int duracaoMinutos;
    private String autor;
    private int totalReproducoes;
    private int totalCurtidas=0;
    private int classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
