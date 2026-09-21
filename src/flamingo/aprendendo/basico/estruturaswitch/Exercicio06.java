package flamingo.aprendendo.basico.estruturaswitch;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados pelo usuário
        System.out.println("Digite o número da operação (1: Soma, 2: Subtração, 3: Multiplicação, 4: Divisão): ");
        int operacao = sc.nextInt();

        System.out.println("Digite o primeiro número: ");
        double numero01 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero02 = sc.nextDouble();

        double resultado = 0;
        String nomeOperacao = "";
        boolean operacaoValida = true;

        switch (operacao) {
            case 1:
                nomeOperacao = "Soma";
                resultado = numero01 + numero02;
                break;
            case 2:
                nomeOperacao = "Subtração";
                resultado = numero01 - numero02;
                break;
            case 3:
                nomeOperacao = "Multiplicação";
                resultado = numero01 * numero02;
                break;
            case 4:
                nomeOperacao = "Divisão";
                if (numero02 == 0) {
                    System.out.println("Não é possível dividir por zero");
                    operacaoValida = false;
                } else {
                    resultado = numero01 / numero02;
                }
                break;
            default:
                operacaoValida = false;
                System.out.println("Operação inválida");
                break;
        }

        // Se a operação for válida, exibe o resultado formatado
        if (operacaoValida) {
            System.out.println("Operação escolhida: " + nomeOperacao);
            System.out.println("Resultado: " + resultado);
        }

        // Boa prática: fechar o scanner ao final do uso
        sc.close();
    }
}