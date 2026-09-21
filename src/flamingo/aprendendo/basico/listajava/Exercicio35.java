package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de XP do jogador: ");
        int xp = sc.nextInt();

        if (xp < 1000) {
            System.out.println("iniciante");
        } else if (xp <= 4999) {
            System.out.println("intermediário");
        } else if (xp <= 9999) {
            System.out.println("avançado");
        } else {
            System.out.println("lendário");
        }

        sc.close();
    }
}