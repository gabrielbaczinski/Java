package Heranca.PrimeiraAtividade;

public class Gato extends Animal {
    private String nivelDeCaca;

    public Gato(String nome, int idade, String cor, String sexo, String nivelDeCaca){
        super(nome, idade, cor, sexo, nivelDeCaca);
        this.nivelDeCaca = nivelDeCaca;
    }

    public void cacar(){
        System.out.println("O gato está caçando com " + getHabilidadeDeCaca() + " eficiência.");
    }

    public String getHabilidadeDeCaca() {
        return nivelDeCaca;
    }
}
