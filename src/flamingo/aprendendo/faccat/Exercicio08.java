package flamingo.aprendendo.faccat;

import java.util.Scanner;

public class Exercicio08 {
    // 1. Corrigida a assinatura da main
    public static void main(String[] args) {
        double totalEleitores, votosBrancos, votosNulos, votosValidos;
        double percentualBrancos, percentualNulos, percentualValidos;

        Scanner sc = new Scanner(System.in);

        // 2. Corrigidos os textos de exibição
        System.out.print("Digite o total de eleitores: ");
        totalEleitores = sc.nextDouble();

        System.out.print("Digite o total de votos brancos: ");
        votosBrancos = sc.nextDouble();

        System.out.print("Digite o total de votos nulos: ");
        votosNulos = sc.nextDouble(); // 3. Corrigido de nextInt() para nextDouble()

        System.out.print("Digite o total de votos válidos: ");
        votosValidos = sc.nextDouble();

        // Cálculo dos percentuais
        percentualBrancos = (votosBrancos / totalEleitores) * 100;
        percentualNulos = (votosNulos / totalEleitores) * 100;
        percentualValidos = (votosValidos / totalEleitores) * 100;

        // 4. Corrigido %F para %.0f (total sem casas decimais) e %.2f (porcentagens com 2 casas)
        System.out.printf("""
                |======== TOTAL DE %.0f ELEITORES ========|
                | Votos Brancos : %.2f%%                  |
                | Votos Nulos   : %.2f%%                  |
                | Votos Válidos : %.2f%%                  |
                ==========================================
                """, totalEleitores, percentualBrancos, percentualNulos, percentualValidos);

        sc.close();
    }
}