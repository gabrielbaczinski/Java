package Polimorfismo;

public class Gato extends Animal{
    private String carinhoFavorito;

    public Gato(String nome, String especie, String habilidade, String carinhoFavorito){
        super(nome, especie, habilidade);
        this.carinhoFavorito = carinhoFavorito;
    }

    public void arranhar(){
        System.out.println("Arranhando um móvel...");
    }

    @Override
    public void fazerSom(){
        System.out.println("O gato mia...");
    }

}
