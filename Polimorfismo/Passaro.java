package Polimorfismo;

public class Passaro extends Animal{
    private String tamanhoDaAsa;

    public Passaro(String nome, String especie, String habilidade, String tamanhoDaAsa){
        super(nome, especie, habilidade);
        this.tamanhoDaAsa = tamanhoDaAsa;
    }

    public void nadar(){
        System.out.println("Nadando");
    }

    @Override
    public void fazerSom(){
        System.out.println("O pássaro canta...");
    }
}
