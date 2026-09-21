package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double bonus = (salario < 3000.0) ? 500.0 : 200.0;
        double valorTotal = salario + bonus;

        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}