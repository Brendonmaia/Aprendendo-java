package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Posto de combustível:");
        System.out.println("1: gasolina — R$ 5,80");
        System.out.println("2: etanol — R$ 4,20");
        System.out.println("3: diesel — R$ 6,00");

        System.out.print("Digite o tipo de combustível: ");
        int tipo = scanner.nextInt();

        System.out.print("Digite a quantidade de litros: ");
        double litros = scanner.nextDouble();

        double precoLitro = 0.0;

        switch (tipo) {
            case 1:
                precoLitro = 5.80;
                break;
            case 2:
                precoLitro = 4.20;
                break;
            case 3:
                precoLitro = 6.00;
                break;
            default:
                System.out.println("Combustível inválido.");
                break;
        }

        double valorTotal = precoLitro * litros;
        System.out.println("Valor total a pagar: R$ " + valorTotal);

        scanner.close();
    }
}