package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio07 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 1. Entrada de dados
            System.out.println("Digite o valor do produto: ");
            double valorProduto = sc.nextDouble();

            System.out.println("Digite a região (1: Sudeste, 2: Sul, 3: Nordeste, 4: Norte, 5: Centro-Oeste): ");
            int regiao = sc.nextInt();

            double valorFrete = 0;
            String nomeRegiao = "";
            boolean regiaoValida = true;

            // 2. Processamento com Switch (descobre a região e o valor base do frete)
            switch (regiao) {
                case 1:
                    nomeRegiao = "Sudeste";
                    valorFrete = 20.00;
                    break;
                case 2:
                    nomeRegiao = "Sul";
                    valorFrete = 25.00;
                    break;
                case 3:
                    nomeRegiao = "Nordeste";
                    valorFrete = 35.00;
                    break;
                case 4:
                    nomeRegiao = "Norte";
                    valorFrete = 45.00;
                    break;
                case 5:
                    nomeRegiao = "Centro-Oeste";
                    valorFrete = 30.00;
                    break;
                default:
                    regiaoValida = false;
                    System.out.println("Região inválida");
                    break;
            }

            // 3. Verificação do frete grátis (se a região for válida)
            if (regiaoValida) {
                if (valorProduto >= 300.0) {
                    valorFrete = 0.0; // Frete grátis se o produto for >= 300
                }

                double valorFinal = valorProduto + valorFrete;

                // 4. Saída de dados (Exibindo o resultado igual ao exemplo)
                System.out.println("Região: " + nomeRegiao);
                System.out.println("Valor do produto: R$ " + valorProduto);
                System.out.println("Frete: R$ " + valorFrete);
                System.out.println("Valor final: R$ " + valorFinal);
            }

            sc.close();
        }
    }

