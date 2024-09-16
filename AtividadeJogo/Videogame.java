package AtividadeJogo;

public class Videogame {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Resident Evil", "Terror", "Leon", "Single player", "Pago");

        jogo.ligar();
        jogo.carregarSave();
        jogo.selecionarDificuldade();
        jogo.iniciarTutorial();
        jogo.selecionarPersonagem();
        jogo.sair();

        System.out.println("__________________");

        Jogo jogo2 = new Jogo();
        jogo.nome = "Genshin Impact";
        jogo.genero = "RPG";
        jogo.personagem = "Hutao";
        jogo.estilo = "Single player";
        jogo.servidor = "Gratuito";

        jogo.ligar();
        jogo.carregarSave();
        jogo.selecionarDificuldade();
        jogo.iniciarTutorial();
        jogo.selecionarPersonagem();
        jogo.sair();
    }
}
