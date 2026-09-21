package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Digite o nome do produto: ");
        String nomeProduto = sc.nextLine();

        System.out.println("Digite o valor unitário do produto (R$): ");
        double valorUnitario = sc.nextDouble();

        System.out.println("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        // 2. Processamento (Calculando o valor total)
        double valorTotal = valorUnitario * quantidade;

        // 3. Saída de dados formatada
        System.out.printf("Produto: %s | Quantidade: %d | Valor total da compra: R$ %.2f%n",
                nomeProduto, quantidade, valorTotal);

        sc.close();
    }
}