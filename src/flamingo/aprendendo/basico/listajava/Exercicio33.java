package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o salário do usuário: ");
        double salario = sc.nextDouble();

        if (salario <= 1500) {
            System.out.println("salário baixo");
        } else if (salario <= 3000) {
            System.out.println("salário médio");
        } else if (salario <= 7000) {
            System.out.println("salário bom");
        } else {
            System.out.println("salário alto");
        }

        sc.close();
    }
}