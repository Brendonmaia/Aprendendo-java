package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        String nome = "";
        String cidade = "";
        int idade = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        sc.nextLine(); //Ele limpa o "Enter" que sobrou do nextInt()

        System.out.println("Digite a sua cidade: ");
        cidade = sc.nextLine();

        System.out.printf("Prazer, eu me chamo %s, tenho %d anos e moro na cidade do %s%n", nome, idade, cidade);

        sc.close();
    }
}