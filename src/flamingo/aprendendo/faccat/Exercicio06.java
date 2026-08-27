package flamingo.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio06 {

    static void main() {
        Scanner sc = new Scanner(System.in);// essa linha é um leitor de tela (system.out joga na tela e system.in le o que o usuario digitou.)
        double altura, base, area;

        System.out.println("Digite a base do retângulo");
        base =  sc.nextDouble();
        System.out.println("Digite a altura do retângulo");
        altura = sc.nextDouble();// chama a variavel.

        area = base * altura;

        System.out.printf("A Área do retângulo = %.2f", area);// %.2f - serve pra indicar o numero de casas decimais  - ex - 2f = 2.22
        //souf - serve para inserir varias variaveis dentro de uma string usando especificadores de formato
        //souf - %s - para texto, %d para numeros inteiros, %f para decimais.
        //souf - substitui a concatenação.


        sc.close();
    }
}
