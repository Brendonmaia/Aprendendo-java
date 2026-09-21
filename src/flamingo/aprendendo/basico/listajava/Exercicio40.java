package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total gasto pelo cliente no mês: ");
        double totalGasto = sc.nextDouble();

        if (totalGasto <= 100) {
            System.out.println("cliente comum");
        } else if (totalGasto <= 500) {
            System.out.println("cliente bronze");
        } else if (totalGasto <= 1000) {
            System.out.println("cliente prata");
        } else {
            System.out.println("cliente ouro");
        }

        sc.close();
    }
}