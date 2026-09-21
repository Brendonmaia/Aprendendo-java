package flamingo.aprendendo.basico.estruturaderp;

public class Exercicio09 {
        public static void main(String[] args) {
            int tentativas = 0; // Começa com zero tentativas feitas

            // O while repete ENQUANTO a condição for verdadeira
            while (tentativas < 3) {
                System.out.println("Tentando fazer login...");
                tentativas++; // Importante: aumenta a tentativa para não travar em loop infinito!
            }

            System.out.println("Número máximo de tentativas atingido");
        }
    }

