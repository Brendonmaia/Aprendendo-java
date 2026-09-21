package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Digite a medida em metros: ");
        double metros = sc.nextDouble();

        // 2. Processamento (1 metro equivale a 100 centímetros)
        double centimetros = metros * 100;

        // 3. Saída de dados
        System.out.printf("A medida de %.2f metros equivale a %.2f centímetros.%n", metros, centimetros);

        sc.close();
    }
}