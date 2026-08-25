package faccatJailson;

import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Programa sucessor");
        System.out.println("Digite um valor para saber seu sucessor");
        int numero = sc.nextInt();
        int sucessor = numero + 1;
        System.out.println("O numero antecessor do valor digitado é:" + sucessor);
        sc.close();


    }
}
