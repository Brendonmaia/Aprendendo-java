package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio21 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade");
      int idade = sc.nextInt();
        if (idade >=18){
        System.out.println("Maior de idade");

    }else{
            System.out.println("Menor de idade");
            sc.close();
        }
}
}