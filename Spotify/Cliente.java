package Spotify;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente extends Usuario{
    private int assinatura;
    private ArrayList<Musica> playlist;

    public Cliente(String email, String senha, String nome, String genero, String dataNascimento, int assinatura) {
        super(nome, email, senha, dataNascimento, genero);
        this.assinatura = assinatura;
        this.playlist = new ArrayList<>();
    }

    public String getAssinatura() {
        if (assinatura == 1) {
            return "Spotify Free";
        } else {
            return "Spotify Premium";
        }
    }

    public void tocarPlaylist() {
        for (int i = 0; i < playlist.size(); i++) {
            Musica m = playlist.get(i);
            System.out.println("Agora está tocando: ");
            System.out.println("Track " + (i + 1) + ": " + m.getArtista() + " - " + m.getTitulo() + " | Duração: " + m.getDuracao());
            System.out.println("1 - Próxima música\n2 - Parar reprodução");
            Scanner sc = new Scanner(System.in);
            int comando = sc.nextInt();
            if (comando == 1) {
                continue;
            } else if (comando == 2) {
                System.out.println("Reprodução interrompida.");
                break;
            } else {
                System.out.println("Comando inválido. Continuando com a próxima música.");
            }
        }
    }

    public void addMusicaToPlaylist(Musica musica) {
        playlist.add(musica);
    }

    public void deleteMusicaToPlaylist(Musica musica) {
        playlist.remove(musica);
    }

    public void setAssinatura(int assinatura) {
        this.assinatura = assinatura;
    }

    public void printMusicas(ArrayList<Musica> discografia) {
        for (int i = 0; i < discografia.size(); i++) {
            Musica musica = discografia.get(i);
            System.out.println((i + 1) + ": " + musica.getArtista() + " - " + musica.getTitulo() + " | Duração: " + musica.getDuracao());
        }
    }

    public void printPlaylist() {
        System.out.println("Minha Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            Musica musica = playlist.get(i);
            System.out.println("Track " + (i + 1) + ": " + musica.getArtista() + " - " + musica.getTitulo() + " | Duração: " + musica.getDuracao());
        }
    }

    public void acessarPerfil() {
        System.out.println(
                "Email: " + getEmail() + "\n" +
                        "Senha: " + getSenha() + "\n" +
                        "Nome: " + getNome() + "\n" +
                        "Gênero: " + getGenero() + "\n" +
                        "Data de nascimento: " + getDataNascimento() +  "\n" +
                        "Assinatura: " + getAssinatura());

    }

}
