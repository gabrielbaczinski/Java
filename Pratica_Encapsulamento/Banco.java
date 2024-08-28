package Pratica_Encapsulamento;
import java.util.Scanner;

public class Banco {
    Scanner sc = new Scanner(System.in);
    private double saldo = 0;

    public void depositar() {
        System.out.println("Quanto deseja depositar: ");
        double valor = sc.nextDouble();
        saldo += valor;
        System.out.println("Novo saldo: R$ " + saldo);
    }

    public void sacar() {
        System.out.println("Quanto deseja sacar: ");
        double valor = sc.nextDouble();
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");}
        else {
            saldo -= valor;
            System.out.println("Novo saldo: R$ " + saldo);
        }
    }

    public void getSaldo(){
        System.out.println("Saldo: R$ " + saldo);
    }

}
