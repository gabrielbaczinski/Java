package Spotify;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        boolean loop_cliente = true;
        boolean loop_adm = true;
        ArrayList<Musica> discografia = new ArrayList<>();
        discografia.add(new Musica("Arctic Monkeys","505", "4:13"));
        discografia.add(new Musica("Billie Eilish", "BIRDS OF A FEATHER", "3:30"));
        discografia.add(new Musica("Lady Gaga, Bruno Mars", "Die With A Smile", "4:12"));
        discografia.add(new Musica("Chappell Roan", "Good Luck, Babe!", "3:38"));
        discografia.add(new Musica("Vacations", "Home", "2:26"));
        discografia.add(new Musica("SZA, Travis Scott", "Open Arms", "4:00"));
        discografia.add(new Musica("Surf Curse", "Freaks", "2:27"));

        String menu = """
                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                │       Bem-vindo ao Spotify!          │
                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                │ Insira suas informações de cadastro  │
                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛""";
        System.out.println(menu);

        System.out.print("Defina um e-mail para cadastro: \n");
        String email = sc.nextLine();
        System.out.print("Defina uma senha: \n");
        String senha = sc.nextLine();
        System.out.print("Como gostaria de ser chamado? \n");
        String nome = sc.nextLine();
        System.out.print("""
                Qual gênero você se identifica:\s
                1 - Masculino
                2 - Feminino
                3 - Outro
                """);
        String genero = sc.nextLine();
        System.out.print("Digite sua data de nascimento: \n");
        String dataNascimento = sc.nextLine();

        while (loop) {
            String menu_disc = """
                                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                                │               Menu                   │
                                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                                │ 1 - Spotify Listener                 │
                                │ 2 - Spotify Artist                   │
                                │ 3 - Logout                           │
                                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛""";
            System.out.println(menu_disc);
            System.out.print("O que deseja fazer: ");
            int escolha_disc = sc.nextInt();
            sc.nextLine();

            switch (escolha_disc) {
                case 1:
                    System.out.print("""
                            Qual plano deseja se cadastrar:\s
                            1 - Spotify Free
                            2 - Spotify Premium
                            """);
                    int assinatura = sc.nextInt();
                    sc.nextLine();

                    Cliente cliente = new Cliente(email, senha, nome, genero, dataNascimento, assinatura);
                    cliente.acessarPerfil();

                while (loop_cliente) {
                    String menu_cliente = """
                                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                                │               Menu                   │
                                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                                │ 1 - Acessar perfil                   │
                                │ 2 - Tocar minha playlist             │
                                │ 3 - Gerenciar minhas músicas         │
                                │ 4 - Adicionar músicas à playlist     │
                                │ 5 - Deletar músicas à playlist       │
                                │ 6 - Logout                           │
                                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛""";
                    System.out.println(menu_cliente);
                    System.out.print("O que deseja fazer: ");
                    int escolha_cliente = sc.nextInt();
                    sc.nextLine();

                    switch (escolha_cliente) {
                        case 1:
                            cliente.acessarPerfil();
                            break;
                        case 2:
                            cliente.tocarPlaylist();
                            break;
                        case 3:
                            cliente.printPlaylist();
                            break;
                        case 4:
                            cliente.printMusicas(discografia);
                            System.out.print("Qual música deseja adicionar à playlist: ");
                            int indexMusica = sc.nextInt();
                            Musica musicaSelecionada = discografia.get(indexMusica - 1);
                            cliente.addMusicaToPlaylist(musicaSelecionada);
                            System.out.println("Música adicionada à playlist!");
                            break;
                        case 5:
                            cliente.printPlaylist();
                            System.out.print("Qual música deseja deletar da playlist: ");
                            int deleteMusic = sc.nextInt();

                            Musica SelectedMusic = discografia.get(deleteMusic - 1);
                            cliente.deleteMusicaToPlaylist(SelectedMusic);
                            System.out.println("Música deletada da playlist!");
                            break;
                        case 6:
                            loop_cliente = false;
                            break;
                    }
                }
                loop_cliente = true;
                break;

                case 2:
                    Administrador adm = new Administrador(email, senha, nome, genero, dataNascimento, discografia);

                    while (loop_adm) {
                        String menu_adm = """
                                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                                │               Menu                   │
                                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                                │ 1 - Acessar perfil                   │
                                │ 2 - Lançar nova música               │
                                │ 3 - Gerenciar músicas                │
                                │ 4 - Deletar músicas                  │
                                │ 5 - Logout                           │
                                ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛""";
                        System.out.println(menu_adm);
                        System.out.print("O que deseja fazer: ");
                        int escolha_adm = sc.nextInt();
                        sc.nextLine();

                        switch (escolha_adm) {
                            case 1:
                                adm.acessarPerfil();
                                break;
                            case 2:
                                System.out.print("Artista da faixa: \n");
                                String artista = sc.nextLine();
                                System.out.print("Nome da Faixa: \n");
                                String titulo = sc.nextLine();
                                System.out.print("Duracao da faixa: \n");
                                String duracao = sc.nextLine();
                                Musica novaMusica = new Musica(artista, titulo, duracao);
                                adm.adicionarMusica(novaMusica);
                                break;
                            case 3:
                                adm.printMusicas();
                                break;
                            case 4:
                                adm.printMusicas();
                                System.out.print("Qual música deseja deletar do sistema: ");
                                int deletarMusica = sc.nextInt();
                                Musica musicaSelecionada = discografia.get(deletarMusica - 1);
                                adm.deletarMusica(musicaSelecionada);
                                System.out.println("Música deletada do sistema!");
                                break;
                            case 5:
                                loop_adm = false;
                                break;
                        }
                    }
                loop_adm = true;
                break;

                case 3:
                    System.out.println("Obrigado por utilizar o programa!");
                    loop = false;
                    break;
            }
        }
    }
}