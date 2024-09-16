package Heranca.PrimeiraAtividade;

public class Animal {
    private String nome;
    private int idade;
    private String cor;
    private String sexo;
    private String aniversario;

    public Animal(String nome, int idade, String cor, String sexo, String aniversario) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
        this.aniversario = aniversario;
    }

    public void dormir(){
        System.out.println(getNome() + " está dormindo");
    }

    public String getNome(){
        return nome;
    }
}
