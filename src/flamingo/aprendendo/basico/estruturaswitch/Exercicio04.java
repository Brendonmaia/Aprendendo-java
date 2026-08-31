package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipoVeiculo;
        int horas;
        double total;

        System.out.println("1 → Moto        — R$ 5,00 por hora");
        System.out.println("2 → Carro       — R$ 10,00 por hora");
        System.out.println("3 → Caminhonete — R$ 15,00 por hora");
        System.out.print("Escolha o tipo de veículo: ");

        tipoVeiculo = sc.nextInt();

        switch (tipoVeiculo) {
            case 1:
                System.out.print("Digite a quantidade de horas: ");
                horas = sc.nextInt();
                total = horas * 5.00;

                if (horas > 5) {
                    total = total + 10.00; // Adiciona a taxa extra
                    System.out.println("Veículo: Moto Horas estacionado: " + horas + " Taxa adicional: R$ 10.0 Valor total: R$ " + total);
                } else {
                    System.out.println("Veículo: Moto Horas estacionado: " + horas + " Valor total: R$ " + total);
                }
                break;

            case 2:
                System.out.print("Digite a quantidade de horas: ");
                horas = sc.nextInt();
                total = horas * 10.00;

                if (horas > 5) {
                    total = total + 10.00; // Adiciona a taxa extra
                    System.out.println("Veículo: Carro Horas estacionado: " + horas + " Taxa adicional: R$ 10.0 Valor total: R$ " + total);
                } else {
                    System.out.println("Veículo: Carro Horas estacionado: " + horas + " Valor total: R$ " + total);
                }
                break;

            case 3:
                System.out.print("Digite a quantidade de horas: ");
                horas = sc.nextInt();
                total = horas * 15.00;

                if (horas > 5) {
                    total = total + 10.00; // Adiciona a taxa extra
                    System.out.println("Veículo: Caminhonete Horas estacionado: " + horas + " Taxa adicional: R$ 10.0 Valor total: R$ " + total);
                } else {
                    System.out.println("Veículo: Caminhonete Horas estacionado: " + horas + " Valor total: R$ " + total);
                }
                break;

            default:
                System.out.println("Tipo de veículo inválido");
                break;
        }

        sc.close();
    }
}