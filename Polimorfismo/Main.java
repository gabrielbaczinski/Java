package Polimorfismo;

public class Main {
    private Animal[] animals = {
            new Gato("Miau", "Felino", "Pular", "Barriga"),
            new Passaro("Piu", "Ave", "Voar", "14 cm"),
            new Peixe("Nemo", "Peixe", "Nadar", "Ósseo")
    };

    public void imprimirAnimais(Animal a) {
        System.out.println("Nome: " + a.getNome());
        System.out.println("Espécie: " + a.getEspecie());
        System.out.println("Habilidade: " + a.getHabilidade());
    }
    
    public void runAnimais() {
        System.out.println("Animais: ");
        System.out.println();

        for (Animal a : animals) {
            imprimirAnimais(a);
            a.fazerSom();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main().runAnimais();
    }
}

