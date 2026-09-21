package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Você possui CNH? (true para Sim / false para Não): ");
        boolean temCnh = sc.nextBoolean();

        if (idade >= 18 && temCnh) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir.");
        }

        sc.close();
    }
}