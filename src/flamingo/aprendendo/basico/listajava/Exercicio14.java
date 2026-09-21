package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos no estoque: ");
        int quantidade = sc.nextInt();

        if (quantidade > 0) {
            System.out.println("Produto disponível para venda.");
        }

        sc.close();
    }
}