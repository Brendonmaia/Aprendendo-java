package flamingo.aprendendo.faccat;
//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores.

import java.util.Scanner;


public class Exercicio08 {
    static void main() {
        double totalEleitores, votosBrancos, votosNulos, votosValidos;
        double percentualBrancos, percentualNulos, percentualValidos;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o total de eleitores:");
        totalEleitores = sc.nextDouble();

        System.out.print("Digite o total de eleitores:");
        votosBrancos = sc.nextDouble();

        System.out.print("Digite o total de eleitores:");
        votosNulos = sc.nextInt();

        System.out.print("Digite o total de eleitores:");
        votosValidos = sc.nextDouble();

        percentualBrancos = (votosBrancos / totalEleitores) * 100;
        percentualNulos = (votosNulos / totalEleitores) * 100;
        percentualValidos = (votosValidos / totalEleitores ) * 100;


        System.out.printf("""
                |========TOTAL DE %F VOTOS========|
                | Votos Brancos = %f%%            |
                | Votos Nulos = %f%%              |
                |Votos Validos = %f%%             |
                ===================================
                """, totalEleitores, percentualBrancos, percentualNulos, percentualValidos);



        sc.close();
    }
}
