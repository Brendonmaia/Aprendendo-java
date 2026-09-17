package flamingo.aprendendo.basico;

    import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

        } while (opcao != 3);

        System.out.println("Sistema encerrado");
        scanner.close();
    }
}

