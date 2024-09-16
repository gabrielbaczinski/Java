package Heranca.PrimeiraAtividade;

public class   Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob", 3, "Branco", "Masc", "rastrear drogas");
        Gato gato = new Gato("Maya", 1, "Preto", "Femin", "média");

        gato.cacar();
        cachorro.emServico();
        gato.dormir();
        cachorro.dormir();
    }
}
