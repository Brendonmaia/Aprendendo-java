package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        // 2. Processamento (Soma as três notas e divide por 3)
        double media = (nota1 + nota2 + nota3) / 3.0;

        // 3. Saída de dados formatada
        System.out.printf("A média final das três notas é: %.2f%n", media);

        sc.close();
    }
}