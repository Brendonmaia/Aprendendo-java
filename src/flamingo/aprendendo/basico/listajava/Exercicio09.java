package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Digite a temperatura em graus Celsius (°C): ");
        double celsius = sc.nextDouble();

        // 2. Processamento (Fórmula de conversão: (C * 9/5) + 32)
        double fahrenheit = (celsius * 1.8) + 32;

        // 3. Saída de dados formatada
        System.out.printf("%.2f°C equivalem a %.2f°F%n", celsius, fahrenheit);

        sc.close();
    }
}