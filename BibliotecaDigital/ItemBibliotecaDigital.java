package BibliotecaDigital;

public abstract class ItemBibliotecaDigital {
    private String titulo;
    private String autor;

    public ItemBibliotecaDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract String descricao();

    public abstract String getAutor();

    public abstract String getTitulo();
}
