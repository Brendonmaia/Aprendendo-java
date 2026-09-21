package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        if (saldo > 0) {
            System.out.println("Você possui saldo disponível.");
        }

        sc.close();
    }
}