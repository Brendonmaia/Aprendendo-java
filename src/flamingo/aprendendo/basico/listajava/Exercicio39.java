package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do atleta: ");
        int idade = sc.nextInt();

        if (idade <= 10) {
            System.out.println("infantil");
        } else if (idade <= 15) {
            System.out.println("juvenil");
        } else if (idade <= 20) {
            System.out.println("júnior");
        } else if (idade <= 35) {
            System.out.println("profissional");
        } else {
            System.out.println("sênior");
        }

        sc.close();
    }
}