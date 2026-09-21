package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Escolha o tipo de ingresso (1: Inteira, 2: Meia-entrada, 3: VIP): ");
        int tipoIngresso = sc.nextInt();

        System.out.println("Digite a quantidade de ingressos: ");
        int quantidade = sc.nextInt();

        double precoUnitario = 0;
        String nomeIngresso = "";
        boolean tipoValido = true;

        // 2. Processamento com Switch (descobre o tipo e o valor do ingresso)
        switch (tipoIngresso) {
            case 1:
                nomeIngresso = "Inteira";
                precoUnitario = 32.00;
                break;
            case 2:
                nomeIngresso = "Meia-entrada";
                precoUnitario = 16.00;
                break;
            case 3:
                nomeIngresso = "VIP";
                precoUnitario = 60.00;
                break;
            default:
                tipoValido = false;
                System.out.println("Tipo de ingresso inválido");
                break;
        }

        // 3. Se o tipo for válido, calcula o valor total e aplica o desconto se necessário
        if (tipoValido) {
            double valorTotal = precoUnitario * quantidade;
            String textoDesconto = "0%";

            // Regra do desconto: Se comprar mais de 4 ingressos, ganha 5% de desconto
            if (quantidade > 4) {
                valorTotal = valorTotal * 0.95; // Aplica 5% de desconto (tira 5%, sobra 95%)
                textoDesconto = "5%";
            }

            // 4. Saída de dados (Exibindo igual ao exemplo)
            System.out.println("Tipo de ingresso: " + nomeIngresso);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Desconto aplicado: " + textoDesconto);
            System.out.println("Valor final: R$ " + valorTotal);
        }

        sc.close();
    }
}