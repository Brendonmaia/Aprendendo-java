
package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Escolha o produto (1: Açaí, 2: Sorvete, 3: Milkshake): ");
        int produto = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        System.out.println("Diz aí, tem adicional? (true para Sim / false para Não): ");
        boolean temAdicional = sc.nextBoolean();

        double precoUnitario = 0;
        String nomeProduto = "";
        boolean produtoValido = true;

        // 2. Processamento com Switch
        switch (produto) {
            case 1:
                nomeProduto = "Açaí";
                precoUnitario = 18.00;
                break;
            case 2:
                nomeProduto = "Sorvete";
                precoUnitario = 12.00;
                break;
            case 3:
                nomeProduto = "Milkshake";
                precoUnitario = 20.00;
                break;
            default:
                produtoValido = false;
                System.out.println("Produto inválido");
                break;
        }

        // 3. Se o produto for válido, calcula o valor total
        if (produtoValido) {
            double valorTotal = precoUnitario * quantidade;

            // Se tem adicional, soma R$ 5,00 por unidade
            if (temAdicional) {
                valorTotal = valorTotal + (5.00 * quantidade);
            }

            // Texto amigável para o adicional
            String textoAdicional = temAdicional ? "Sim" : "Não";

            // 4. Exibição do resultado
            System.out.println("Produto escolhido: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Adicional: " + textoAdicional);
            System.out.println("Valor total: R$ " + valorTotal);
        }

        sc.close();
    }
}