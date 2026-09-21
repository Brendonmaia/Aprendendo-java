package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        System.out.println("Digite a presença do aluno: ");
        double presenca = sc.nextDouble();

        if (nota >= 7 && presenca >= 75) {
            System.out.println("aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("recuperação");
        } else {
            System.out.println("reprovado");
        }

        sc.close();
    }
}