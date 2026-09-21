package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 150) {
            System.out.println("Frete grátis.");
        } else {
            System.out.println("Frete de R$ 20,00.");
        }

        sc.close();
    }
}