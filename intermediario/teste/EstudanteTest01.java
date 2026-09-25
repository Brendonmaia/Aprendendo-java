package flamingo.aprendendo.intermediario.teste;

import flamingo.aprendendo.intermediario.dominio.Estudante;

import java.util.Scanner;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do estudante: ");
        String nome = sc.nextLine();// NextLine pega o dado do tipo String, Integer.parseInt do string para number
        estudante.nome = nome;

        System.out.println("Dite a idade do estudante: ");
        int idade = Integer.parseInt(sc.nextLine());
        estudante.idade = idade;

        System.out.println("Digite o rg do estudante: ");
        String rg = sc.nextLine();
        estudante.rg = rg;

        System.out.println("Digite o telefone do estudante: ");
        String tel = sc.nextLine();
        estudante.tel = tel;

        System.out.println("Digite o curso do estudante: ");
        String curso = sc.nextLine();
        estudante.curso = curso;

    }
}
