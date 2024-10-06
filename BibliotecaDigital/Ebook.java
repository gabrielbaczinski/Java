package BibliotecaDigital;

import Spotify.Musica;

import java.util.ArrayList;

public class Ebook extends ItemBibliotecaDigital implements Baixavel{

    public Ebook(String titulo, String autor){
        super(titulo, autor);
    }

    public String descricao(){
        System.out.println("Descrição");
        return "Ebook";
    }

    @Override
    public void baixar(String titulo) {
        System.out.println(titulo + "está sendo baixado...");
    }

    public void printEbooks(ArrayList<Ebook> ebooks) {
        for (int i = 0; i < ebooks.size(); i++) {
            Ebook ebook = ebooks.get(i);
            System.out.println((i + 1) + ": " + .getArtista() + " - " + musica.getTitulo() + " | Duração: " + musica.getDuracao());
        }
    }
}
