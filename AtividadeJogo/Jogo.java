package AtividadeJogo;

public class Jogo {
    public String nome;
    public String genero;
    public String personagem;
    public String estilo;
    public String servidor;

    //Variáveis membros
    public boolean ligado = false;

    public Jogo(String nome, String genero, String personagem, String estilo, String servidor) {
        this.nome = nome;
        this.genero = genero;
        this.personagem = personagem;
        this.estilo = estilo;
        this.servidor = servidor;
    }

    public Jogo() {
        nome = null;
        genero = null;
        personagem = null;
        estilo = null;
        servidor = null;
    }

    public boolean IsLigado() {
        return ligado;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O " + nome + " está iniciando");
    }

    public void carregarSave() {
        if(IsLigado()) {
            System.out.println("Carregando save.");
        }
    }

    public void selecionarPersonagem() {
        if(IsLigado()) {
            System.out.println(personagem + " selecionado");
        }
    }
    public void selecionarDificuldade() {
        if(IsLigado()) {
            System.out.println("Dificuldade selecionada.");
        }
    }

    public void iniciarTutorial() {
        if(IsLigado()) {
            System.out.println("Seja bem-vindo ao tutorial!");
        }
    }

    public void sair() {
        if(IsLigado()) {
            ligado = false;
            System.out.println(nome + " fechando...");
        }
    }
}