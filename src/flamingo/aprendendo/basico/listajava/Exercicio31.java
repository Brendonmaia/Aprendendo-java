package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio31 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();

        if (idade<12){
            System.out.println("Criança");

        } else if (idade >12&& idade<17) {
            System.out.println("Adolescente");



        }else if (idade >18&& idade<59) {
            System.out.println("Adulto");

        }else {
            System.out.println("Idoso");
        }


        sc.close();
    }
}
