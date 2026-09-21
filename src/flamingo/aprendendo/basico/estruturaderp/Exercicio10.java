package flamingo.aprendendo.basico.estruturaderp;

public class Exercicio10 {
        public static void main(String[] args) {
            int opcao = 3; // Simulando a opção escolhida

            do {
                // O bloco "do" executa PRIMEIRO, antes de olhar qualquer regra
                System.out.println("1 - Cadastrar usuário");
                System.out.println("2 - Listar usuários");
                System.out.println("3 - Sair");

            } while (opcao != 3); // Só checa DEPOIS se deve repetir

            System.out.println("Sistema encerrado");
        }
    }

