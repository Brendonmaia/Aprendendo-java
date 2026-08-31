package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcaoLanche;
        int quantidade;
        double total;

        System.out.println("1 → Hambúrguer   — R$ 25,00");
        System.out.println("2 → Pizza        — R$ 40,00");
        System.out.println("3 → Batata frita — R$ 18,00");
        System.out.println("4 → Refrigerante — R$ 8,00");
        System.out.println("5 → Suco         — R$ 10,00");
        System.out.print("Escolha a opção: ");

        opcaoLanche = sc.nextInt();

        switch (opcaoLanche) {
            case 1:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                total = quantidade * 25.00;
                System.out.println("Item escolhido: Hambúrguer Quantidade: " + quantidade + " Total do pedido: R$ " + total);
                break;
            case 2:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                total = quantidade * 40.00;
                System.out.println("Item escolhido: Pizza Quantidade: " + quantidade + " Total do pedido: R$ " + total);
                break;
            case 3:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                total = quantidade * 18.00;
                System.out.println("Item escolhido: Batata frita Quantidade: " + quantidade + " Total do pedido: R$ " + total);
                break;
            case 4:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                total = quantidade * 8.00;
                System.out.println("Item escolhido: Refrigerante Quantidade: " + quantidade + " Total do pedido: R$ " + total);
                break;
            case 5:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                total = quantidade * 10.00;
                System.out.println("Item escolhido: Suco Quantidade: " + quantidade + " Total do pedido: R$ " + total);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();
    }
}