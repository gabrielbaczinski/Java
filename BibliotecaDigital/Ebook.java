package BibliotecaDigital;
import java.util.ArrayList;

public class Ebook extends ItemBibliotecaDigital implements Baixavel{

    public Ebook(String titulo, String autor){
        super(titulo, autor);
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    public String descricao(){
        System.out.println("Descrição");
        return "Ebook";
    }

    @Override
    public void baixar(String titulo) {
        System.out.println(titulo + "está sendo baixado...");
    }

    public void getEbooks(ArrayList<Ebook> ebooks) {
        for (int i = 0; i < ebooks.size(); i++) {
            Ebook ebook = ebooks.get(i);
            System.out.println((i + 1) + ": " + ebook.getTitulo() + " - " + ebook.getAutor());
        }
    }
}
