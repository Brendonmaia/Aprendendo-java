package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Digite quanto você ganha por hora (R$): ");
        double valorHora = sc.nextDouble();

        System.out.println("Digite o total de horas trabalhadas no mês: ");
        double horasTrabalhadas = sc.nextDouble();

        // 2. Processamento (Calculando o salário bruto)
        double salarioBruto = valorHora * horasTrabalhadas;

        // 3. Saída de dados formatada
        System.out.printf("O seu salário bruto total é: R$ %.2f%n", salarioBruto);

        sc.close();
    }
}