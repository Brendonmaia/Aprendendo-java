package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o email: ");
        String email = sc.next();

        System.out.println("Digite a senha: ");
        String senha = sc.next();

        if (email.equals("admin@email.com") && senha.equals("123456")) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Email ou senha inválidos.");
        }

        sc.close();
    }
}