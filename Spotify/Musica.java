package Spotify;

public class Musica {
    private String titulo;
    private String duracao;
    private String artista;

    public Musica(String artista, String titulo, String duracao) {
        this.artista = artista;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracao() {
        return duracao;
    }
}

