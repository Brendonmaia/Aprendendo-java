package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a velocidade do veículo (km/h): ");
        double velocidade = sc.nextDouble();

        if (velocidade > 80) {
            System.out.println("Você foi multado.");
        }

        sc.close();
    }
}