package Heranca.PrimeiraAtividade;

public class Cachorro extends Animal {
    private String habilidadeDeTrabalho;

    public Cachorro(String nome, int idade, String cor, String sexo, String habilidadeDeTrabalho){
        super(nome, idade, cor, sexo, habilidadeDeTrabalho);
        this.habilidadeDeTrabalho = habilidadeDeTrabalho;
    }

    public void emServico(){
        System.out.println("O cão sabe " + getHabilidadeDeTrabalho());
    }

    public String getHabilidadeDeTrabalho() {
        return habilidadeDeTrabalho;
    }
}
