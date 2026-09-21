package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aluno aprovado.");
        }

        sc.close();
    }
}