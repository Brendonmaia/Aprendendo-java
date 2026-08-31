//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
//brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
//de eleitores.


package faccatJailson;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa Eleitores");
        System.out.println("Digite o total de eleitores: ");
        double totaleleitores = sc.nextDouble();
        System.out.println("Digite o número de votos brancos: ");
        double votosbrancos = sc.nextDouble();
        System.out.println("Digite o número de votos nulos: ");
        double votosnulos = sc.nextDouble();
        System.out.println("Digite o total de votos válidos: ");
        double votosvalidos = sc.nextDouble();
        double percentualBrancos =  votosbrancos * 100.0 / totaleleitores;
        double percentualNulos =  (double) (votosnulos/totaleleitores) * 100;
        double percentualValidos =(double) (votosvalidos/totaleleitores) * 100;
        System.out.println("O percentual de votos brancos são " + percentualBrancos);
        System.out.println("O percentual de votos nulos são " + percentualNulos);
        System.out.println("O percentual de votos válidos são " + percentualValidos);
    }
}
