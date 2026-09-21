package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 até 7:");
        int numero = sc.nextInt();
        String diasemana;

        switch (numero) {
            case 1:
                diasemana = "Domingo";
                break;
            case 2:
                diasemana = "Segunda-feira";
                break;
            case 3:
                diasemana = "Terça-feira";
                break;
            case 4:
                diasemana = "Quarta-feira";
                break;
            case 5:
                diasemana = "Quinta-feira";
                break;
            case 6:
                diasemana = "Sexta-feira";
                break;
            case 7:
                diasemana = "Sábado";
                break;
            default:
                diasemana = "Dia inválido.";
                break;
        }

        System.out.println(diasemana);
        sc.close();
    }
}