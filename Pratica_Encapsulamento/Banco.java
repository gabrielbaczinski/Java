package Pratica_Encapsulamento;
import java.util.Scanner;

public class Banco {
    Scanner sc = new Scanner(System.in);
    private double saldo = 0.0;
    private double valor;

    public double depositar(double valor) {
        saldo += valor;
        System.out.println("Novo saldo: R$ " + saldo);
        return valor;
    }

    public double sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");}
        else {
            saldo -= valor;
            System.out.println("Novo saldo: R$ " + saldo);
        }
        return saldo;
    }

    public double getSaldo(){
        System.out.println("Saldo: R$ " + saldo);
        return this.saldo;
    }



}
