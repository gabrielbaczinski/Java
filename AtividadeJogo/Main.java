package AtividadeJogo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Integer> listaComprimento() {
        System.out.println("Digite o comprimento da lista: ");
        int tamanho = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        adicionaLista(lista, tamanho);
        return lista;
    }

    public void adicionaLista(ArrayList<Integer> lista, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um valor para adicionar à lista:");
            int valor = sc.nextInt();
            lista.add(valor);
        }
    }

    public void verificaLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                System.out.println("O número " + lista.get(i) + " é par!");
            } else if (lista.get(i) % 3 == 0) {
                System.out.println("O número " + lista.get(i) + " é múltiplo de três!");
            } else {
                System.out.println("O número " + lista.get(i) + " é ímpar");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        ArrayList<Integer> lista = main.listaComprimento();
        System.out.println("---------------Resultado---------------");
        main.verificaLista(lista);

    }
}


