package flamingo.aprendendo.basico;

public class TentativasLogin {
    public static void main(String[] args) {
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.println("Tentando fazer login...");
            tentativas++;
        }

        System.out.println("Número máximo de tentativas atingido");
    }
}