package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        byte tipoCombustivel;
        double litros, preco;
        Scanner sc = new Scanner(System.in);

        System.out.printf("""
        Qual o tipo do combustivel?
        1) Gasolina
        2) Etanol
        3) Diesel
        """);

        tipoCombustivel = sc.nextByte();

        switch (tipoCombustivel) {
            case 1:
                System.out.println("Quantos litros de gasolina você deseja?");
                litros = sc.nextDouble();
                preco = litros * 5.89;
                System.out.printf("Preço total do combustivel é R$ %.2f%n", preco);
                break;
            case 2:
                System.out.println("Quantos litros de etanol você deseja?");
                litros = sc.nextDouble();
                preco = litros * 3.99;
                System.out.printf("Preço total do combustivel é R$ %.2f%n", preco);
                break;
            case 3:
                System.out.println("Quantos litros de diesel você deseja?");
                litros = sc.nextDouble();
                preco = litros * 6.19;
                System.out.printf("Preço total do combustivel é R$ %.2f%n", preco);
                break;
            default:
                System.out.println("Não existe essa opção!");
                break;
        }

        sc.close();
    }
}