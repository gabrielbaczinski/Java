package BibliotecaDigital;
import java.util.ArrayList;

public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel{

    public VideoDigital(String titulo, String autor){
        super(titulo, autor);
    }

    @Override
    public void baixar(String titulo) {
        System.out.println(titulo + " está sendo baixado...");
    }

    @Override
    public String descricao() {
        return "";
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void visualizar(String titulo) {
        System.out.println(titulo + "está sendo reproduzido...");
    }

    public void getVideos(ArrayList<VideoDigital> videos) {
        for (int i = 0; i < videos.size(); i++) {
            VideoDigital video = videos.get(i);
            System.out.println((i + 1) + ": " + video.getTitulo() + " - " + video.getAutor());
        }
    }
}
