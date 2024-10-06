package BibliotecaDigital;

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
    public void visualizar(String titulo) {
        System.out.println(titulo + "está sendo reproduzido...");
    }
}
