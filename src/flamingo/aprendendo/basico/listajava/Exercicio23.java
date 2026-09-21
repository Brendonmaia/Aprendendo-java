package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo do cliente: ");
        double saldo = sc.nextDouble();

        System.out.println("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        if (saldo >= valorProduto) {
            System.out.println("Compra aprovada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}