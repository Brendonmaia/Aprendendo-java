package flamingo.aprendendo.basico;

public class OperadoresParte05 {

    public static void main(String[] args) {
        /*
         * atribuição simples
         *  += soma e atribuir
         * -= subtração e atribuição
         * *= multiplicação e atriuição
         * /= divisão e atribuição
         * %= resto da divisão e atribuição
         */

        double totalcompra = 0;
        totalcompra += 50;
        totalcompra += 100;
        totalcompra += 50;

        totalcompra /= 2;

        System.out.printf("total da compra = %.2f", totalcompra);
    }
}
