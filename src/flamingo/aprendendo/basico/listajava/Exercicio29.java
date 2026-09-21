package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 200) {
            double valorComDesconto = valorCompra - (valorCompra * 0.10);
            System.out.println("Valor final da compra com desconto: R$ " + valorComDesconto);
        } else {
            System.out.println("Valor final da compra: R$ " + valorCompra);
        }

        sc.close();
    }
}