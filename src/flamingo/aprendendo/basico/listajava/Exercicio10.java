package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.println("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.println("Digite o cargo do funcionário: ");
        String cargo = sc.nextLine();

        System.out.println("Digite o salário do funcionário (R$): ");
        double salario = sc.nextDouble();

        System.out.println("O funcionário está ativo na empresa? (true para Sim / false para Não): ");
        boolean ativo = sc.nextBoolean();

        // Convertendo o booleano em um texto mais amigável para a frase
        String statusAtivo = ativo ? "Sim" : "Não";

        // 2. Saída de dados formatada
        System.out.println("\n--- Ficha do Funcionário ---");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Cargo: %s%n", cargo);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Ativo na empresa: %s%n", statusAtivo);

        sc.close();
    }
}