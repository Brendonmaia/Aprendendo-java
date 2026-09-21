package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio41 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();
        String mensagem = (idade>=18) ? "Maior de idade" : "Menor de idade";

        System.out.println(mensagem);



    }
}
