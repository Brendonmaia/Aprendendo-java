package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você está logado? (true para Sim / false para Não): ");
        boolean logado = sc.nextBoolean();

        if (logado) {
            System.out.println("Bem-vindo ao sistema.");
        }

        sc.close();
    }
}