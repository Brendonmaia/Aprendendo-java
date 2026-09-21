package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        double temperatura = sc.nextDouble();

        if (temperatura < 15) {
            System.out.println("frio");
        } else if (temperatura <= 25) {
            System.out.println("agradável");
        } else if (temperatura <= 35) {
            System.out.println("quente");
        } else {
            System.out.println("muito quente");
        }

        sc.close();
    }
}