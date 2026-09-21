package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra (R$): ");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 100) {
            System.out.println("Cliente ganhou desconto.");
        }

        sc.close();
    }
}