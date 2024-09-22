package Polimorfismo;

public class Main {
    private Animal[] animals = {
            new Gato("Miau", "Felino", "Pular", "Barriga"),
            new Passaro("Piu", "Ave", "Voar", "14 cm"),
            new Peixe("Nemo", "Peixe", "Nadar", "Ósseo")
};
    public void imprimirAnimais(Animal animals) {
        for (Animal a: animals) {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {
        Main.imprimiranimais;
    }
}

