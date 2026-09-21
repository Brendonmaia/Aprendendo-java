package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        // 2. Processamento (Subtraindo o ano atual pelo ano de nascimento)
        int anoAtual = 2026;
        int idadeAproximada = anoAtual - anoNascimento;

        // 3. Saída de dados
        System.out.printf("Considerando o ano atual, sua idade aproximada é: %d anos%n", idadeAproximada);

        sc.close();
    }
}