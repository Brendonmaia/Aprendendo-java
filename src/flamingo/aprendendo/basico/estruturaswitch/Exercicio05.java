package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipoProduto;
        int quantidade;
        double total;

        System.out.println("1 → Camiseta — R$ 49,90");
        System.out.println("2 → Calça    — R$ 119,90");
        System.out.println("3 → Jaqueta  — R$ 199,90");
        System.out.println("4 → Tênis    — R$ 249,90");
        System.out.print("Escolha o produto: ");

        tipoProduto = sc.nextInt();

        switch (tipoProduto) {
            case 1:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                total = quantidade * 49.90;

                if (quantidade >= 3) {
                    total = total - (total * 0.15); // Aplica 15% de desconto
                    System.out.println("Produto escolhido: Camiseta Quantidade: " + quantidade + " Desconto aplicado: 15% Valor final: R$ " + total);
                } else {
                    System.out.println("Produto escolhido: Camiseta Quantidade: " + quantidade + " Valor final: R$ " + total);
                }
                break;

            case 2:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                total = quantidade * 119.90;

                if (quantidade >= 3) {
                    total = total - (total * 0.15); // Aplica 15% de desconto
                    System.out.println("Produto escolhido: Calça Quantidade: " + quantidade + " Desconto aplicado: 15% Valor final: R$ " + total);
                } else {
                    System.out.println("Produto escolhido: Calça Quantidade: " + quantidade + " Valor final: R$ " + total);
                }
                break;

            case 3:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                total = quantidade * 199.90;

                if (quantidade >= 3) {
                    total = total - (total * 0.15); // Aplica 15% de desconto
                    System.out.println("Produto escolhido: Jaqueta Quantidade: " + quantidade + " Desconto aplicado: 15% Valor final: R$ " + total);
                } else {
                    System.out.println("Produto escolhido: Jaqueta Quantidade: " + quantidade + " Valor final: R$ " + total);
                }
                break;

            case 4:
                System.out.print("Digite a quantidade: ");
                quantidade = sc.nextInt();
                total = quantidade * 249.90;

                if (quantidade >= 3) {
                    total = total - (total * 0.15); // Aplica 15% de desconto
                    System.out.println("Produto escolhido: Tênis Quantidade: " + quantidade + " Desconto aplicado: 15% Valor final: R$ " + total);
                } else {
                    System.out.println("Produto escolhido: Tênis Quantidade: " + quantidade + " Valor final: R$ " + total);
                }
                break;

            default:
                System.out.println("Produto inválido");
                break;
        }

        sc.close();
    }
}