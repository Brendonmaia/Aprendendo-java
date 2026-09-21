package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cardápio:");
        System.out.println("1: hambúrguer — R$ 25,00");
        System.out.println("2: pizza — R$ 40,00");
        System.out.println("3: salada — R$ 18,00");
        System.out.println("4: refrigerante — R$ 8,00");

        System.out.print("Digite a opção escolhida: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double precoUnitario = 0.0;

        switch (opcao) {
            case 1:
                precoUnitario = 25.00;
                break;
            case 2:
                precoUnitario = 40.00;
                break;
            case 3:
                precoUnitario = 18.00;
                break;
            case 4:
                precoUnitario = 8.00;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        double valorTotal = precoUnitario * quantidade;
        System.out.println("Valor total do pedido: R$ " + valorTotal);

        scanner.close();
    }
}