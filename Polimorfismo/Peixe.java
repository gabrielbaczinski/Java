package Polimorfismo;

public class Peixe extends Animal {
    private String tipoDeEsqueleto;

    public Peixe(String nome, String especie, String habilidade, String tipoDeEsqueleto){
        super(nome, especie, habilidade);
        this.tipoDeEsqueleto = tipoDeEsqueleto;
    }

    public void voar(){
        System.out.println("Voando");
    }

    @Override
    public void fazerSom(){
        System.out.println("O peixe faz bolhas...");
    }
}
