package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota final do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}