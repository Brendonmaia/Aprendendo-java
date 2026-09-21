package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("excelente");
        } else if (nota >= 7) {
            System.out.println("bom");
        } else if (nota >= 5) {
            System.out.println("recuperação");
        } else {
            System.out.println("reprovado");
        }

        sc.close();
    }
}