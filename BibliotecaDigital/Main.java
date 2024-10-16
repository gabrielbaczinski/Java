package BibliotecaDigital;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ebook e = new Ebook("Orgulho e Preconceito", "Jane Austen");
        VideoDigital vd = new VideoDigital("A Revolução dos Bichos", "George Orwell");

        ArrayList<Ebook> ebooks = new ArrayList<>();
        ebooks.add(new Ebook("Pequeno Príncipe", "Antoine de Saint-Exupéry"));
        ebooks.add(new Ebook("Dom Quixote", "Miguel de Cervantes"));
        ebooks.add(new Ebook("1984", "George Orwell"));
        ebooks.add(new Ebook("O Senhor dos Anéis", "J.R.R. Tolkien"));
        ebooks.add(new Ebook("Moby Dick", "Herman Melville"));
        ebooks.add(new Ebook("Cem Anos de Solidão", "Gabriel García Márquez"));

        ArrayList<VideoDigital> videos = new ArrayList<>();
        videos.add(new VideoDigital("O Poderoso Chefão", "Francis Ford Coppola"));
        videos.add(new VideoDigital("Star Wars: Uma Nova Esperança", "George Lucas"));
        videos.add(new VideoDigital("Matrix", "Lana e Lilly Wachowski"));
        videos.add(new VideoDigital("Clube da Luta", "David Fincher"));
        videos.add(new VideoDigital("O Senhor dos Anéis: A Sociedade do Anel", "Peter Jackson"));
        videos.add(new VideoDigital("Inception", "Christopher Nolan"));

        boolean loop = true;
        Scanner sc = new Scanner(System.in);

        while (loop) {
            String menu = """
                    ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                    │  Bem-vindo a Biblioteca Digital!     │
                    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                    │ O que deseja fazer?                  │
                    │ 1 - Ver catálogo de Ebooks           │
                    │ 2 - Ver catálogo de Videos Digitais  │
                    │ 3 - Sair                             │
                    ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛""";
            System.out.println(menu);
            System.out.print("O que deseja fazer: ");
            int escolha_cliente = sc.nextInt();
            sc.nextLine();

            switch (escolha_cliente) {
                case 1:
                    e.getEbooks(ebooks);
                    System.out.print("Deseja baixar album ebook?" +
                            "1 - Sim" +
                            "2 - Não");
                    int choice_ebook = sc.nextInt();
                    sc.nextLine();
                    switch (choice_ebook) {
                        case 1:

                    }
                    break;
                case 2:
                    vd.getVideos(videos);
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }
    }
}