package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Escolha o serviço (1: Banho, 2: Tosa, 3: Banho e tosa): ");
        int tipoServico = sc.nextInt();

        System.out.println("Escolha o porte do animal (1: Pequeno, 2: Médio, 3: Grande): ");
        int porteAnimal = sc.nextInt();

        double valorTotal = 0;
        String nomeServico = "";
        String nomePorte = "";
        boolean dadosValidos = true;

        // 2. Switch principal para o Tipo de Serviço
        switch (tipoServico) {
            case 1: // Banho
                nomeServico = "Banho";
                // Switch interno para o Porte do animal no Banho
                switch (porteAnimal) {
                    case 1:
                        nomePorte = "Pequeno";
                        valorTotal = 40.00;
                        break;
                    case 2:
                        nomePorte = "Médio";
                        valorTotal = 55.00;
                        break;
                    case 3:
                        nomePorte = "Grande";
                        valorTotal = 70.00;
                        break;
                    default:
                        dadosValidos = false;
                        break;
                }
                break;

            case 2: // Tosa
                nomeServico = "Tosa";
                // Switch interno para o Porte do animal na Tosa
                switch (porteAnimal) {
                    case 1:
                        nomePorte = "Pequeno";
                        valorTotal = 50.00;
                        break;
                    case 2:
                        nomePorte = "Médio";
                        valorTotal = 65.00;
                        break;
                    case 3:
                        nomePorte = "Grande";
                        valorTotal = 80.00;
                        break;
                    default:
                        dadosValidos = false;
                        break;
                }
                break;

            case 3: // Banho e tosa
                nomeServico = "Banho e tosa";
                // Switch interno para o Porte do animal no Banho e tosa
                switch (porteAnimal) {
                    case 1:
                        nomePorte = "Pequeno";
                        valorTotal = 85.00;
                        break;
                    case 2:
                        nomePorte = "Médio";
                        valorTotal = 110.00;
                        break;
                    case 3:
                        nomePorte = "Grande";
                        valorTotal = 140.00;
                        break;
                    default:
                        dadosValidos = false;
                        break;
                }
                break;

            default:
                dadosValidos = false;
                break;
        }

        // 3. Validação final e Saída
        if (dadosValidos) {
            System.out.println("Serviço escolhido: " + nomeServico);
            System.out.println("Porte do animal: " + nomePorte);
            System.out.println("Valor total: R$ " + valorTotal);
        } else {
            System.out.println("Serviço ou porte inválido!");
        }

        sc.close();
    }
}