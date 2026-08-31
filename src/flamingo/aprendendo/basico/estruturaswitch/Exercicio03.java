package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int plano;
        int meses;
        double total;

        System.out.println("1 → Plano Básico       — R$ 29,90 por mês");
        System.out.println("2 → Plano Profissional — R$ 59,90 por mês");
        System.out.println("3 → Plano Premium      — R$ 99,90 por mês");
        System.out.print("Escolha a opção de plano: ");

        plano = sc.nextInt();

        switch (plano) {
            case 1:
                System.out.print("Digite a quantidade de meses: ");
                meses = sc.nextInt();
                total = meses * 29.90;

                if (meses == 12) {
                    total = total - (total * 0.10);
                    System.out.printf("Plano escolhido: Básico Meses contratados: %d Desconto aplicado: 10%% Valor final: R$ %.2f\n", meses, total);
                } else {
                    System.out.printf("Plano escolhido: Básico Meses contratados: %d Valor final: R$ %.2f\n", meses, total);
                }
                break;

            case 2:
                System.out.print("Digite a quantidade de meses: ");
                meses = sc.nextInt();
                total = meses * 59.90;

                if (meses == 12) {
                    total = total - (total * 0.10);
                    System.out.printf("Plano escolhido: Profissional Meses contratados: %d Desconto aplicado: 10%% Valor final: R$ %.2f\n", meses, total);
                } else {
                    System.out.printf("Plano escolhido: Profissional Meses contratados: %d Valor final: R$ %.2f\n", meses, total);
                }
                break;

            case 3:
                System.out.print("Digite a quantidade de meses: ");
                meses = sc.nextInt();
                total = meses * 99.90;

                if (meses == 12) {
                    total = total - (total * 0.10);
                    System.out.printf("Plano escolhido: Premium Meses contratados: %d Desconto aplicado: 10%% Valor final: R$ %.2f\n", meses, total);
                } else {
                    System.out.printf("Plano escolhido: Premium Meses contratados: %d Valor final: R$ %.2f\n", meses, total);
                }
                break;

            default:
                System.out.println("Plano inválido");
                break;
        }

        sc.close();
    }
}