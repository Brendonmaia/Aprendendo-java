package flamingo.aprendendo.basico.listajava;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = sc.next();

        if (senha.equals("java123")) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Senha incorreta.");
        }

        sc.close();
    }
}