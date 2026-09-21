package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double frete = (valorCompra >= 150.0) ? 0.0 : 20.0;

        System.out.println("Valor do frete: R$ " + frete);

        scanner.close();
    }
}