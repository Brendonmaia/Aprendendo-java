package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();

        // 2. Processamento
        double dobro = numero * 2;
        double metade = numero / 2.0;

        // 3. Saída de dados formatada
        System.out.printf("Número informado: %.2f%n", numero);
        System.out.printf("O dobro é: %.2f%n", dobro);
        System.out.printf("A metade é: %.2f%n", metade);

        sc.close();
    }
}