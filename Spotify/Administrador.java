package Spotify;
import java.util.ArrayList;

public class Administrador extends Usuario {
    private ArrayList<Musica> discografia;


    public Administrador(String email, String senha, String nome, String genero, String dataNascimento, ArrayList<Musica> discografia) {
        super(nome, email, senha, dataNascimento, genero);
        this.discografia = discografia;
    }

    public void adicionarMusica(Musica musica) {
        discografia.add(musica);
        System.out.println("Música '" + musica.getArtista() + " - " + musica.getTitulo() + "' adicionada à discografia.");
    }

    public void deletarMusica(Musica musica) {
        discografia.remove(musica);
        System.out.println("Música '" + musica.getArtista() + " - " + musica.getTitulo() + "' deletada da discografia.");
    }

    public void printMusicas() {
        if (discografia.isEmpty()) {
            System.out.println("Nenhuma música na discografia.");
        } else {
            System.out.println("Discografia:");
            for (int i = 0; i < discografia.size(); i++) {
                Musica musica = discografia.get(i);
                System.out.println(i + 1 + ": " + musica.getArtista() + " - " + musica.getTitulo() + " | Duração: " + musica.getDuracao());
            }
        }
    }

    public void acessarPerfil() {
        System.out.println(
                "Email: " + getEmail() + "\n" +
                        "Senha: " + getSenha() + "\n" +
                        "Nome: " + getNome() + "\n" +
                        "Gênero: " + getGenero() + "\n" +
                        "Data de nascimento: " + getDataNascimento());
    }
}
