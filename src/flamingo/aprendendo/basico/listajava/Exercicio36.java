package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("peso normal");
        } else if (imc <= 29.9) {
            System.out.println("sobrepeso");
        } else {
            System.out.println("obesidade");
        }

        sc.close();
    }
}