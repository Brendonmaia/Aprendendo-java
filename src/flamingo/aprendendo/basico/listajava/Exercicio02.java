package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do aluno: ");
        int idade = sc.nextInt();

        // Limpando o "Enter" pendente do nextInt()
        sc.nextLine();

        System.out.println("Digite a nota final do aluno: ");
        double notaFinal = sc.nextDouble();

        // 2. Saída formatada
        System.out.printf("O(a) aluno(a) %s, de %d anos, obteve a nota final %.2f%n", nome, idade, notaFinal);

        sc.close();
    }
}