package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a porcentagem de presença do aluno: ");
        double presenca = sc.nextDouble();

        if (presenca >= 75) {
            System.out.println("Presença suficiente.");
        }

        sc.close();
    }
}