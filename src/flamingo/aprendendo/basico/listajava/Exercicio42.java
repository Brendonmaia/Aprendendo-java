package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        String resultado = (nota >= 7.0) ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        scanner.close();
    }
}