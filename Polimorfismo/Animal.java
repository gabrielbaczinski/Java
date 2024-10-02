package Polimorfismo;

public class Animal {
    private String nome;
    private String especie;
    private String habilidade;

    Animal(String nome, String especie, String habilidade) {
        this.nome = nome;
        this.especie = especie;
        this.habilidade = habilidade;
    }

    Animal(){
        this.nome = null;
        this.especie = null;
        this.habilidade = null;
    }

    public void comer(){
        System.out.println("O animal está comendo");
    }

    public String getNome(){
        return nome;
    }

    public String getEspecie(){
        return especie;
    }

    public String getHabilidade(){
        return habilidade;
    }

    public void fazerSom(){
        System.out.println("O animal está fazendo barulho");
    }
}
