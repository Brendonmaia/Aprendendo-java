package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorOriginal = sc.nextDouble();
        double percentualDesconto = 0;

        if (valorOriginal > 500) {
            percentualDesconto = 0.15;
        } else if (valorOriginal >= 301) {
            percentualDesconto = 0.10;
        } else if (valorOriginal >= 101) {
            percentualDesconto = 0.05;
        }

        double valorDesconto = valorOriginal * percentualDesconto;
        double valorFinal = valorOriginal - valorDesconto;

        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

        sc.close();
    }
}