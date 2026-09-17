package flamingo.aprendendo.basico;

public class CaixaRegistradora {
    public static void main(String[] args) {
        int quantidadeProdutos = 5;
        double valorProduto = 20;
        double totalCompra = 0;

        for (int i = 1; i <= quantidadeProdutos; i++) {
            totalCompra += valorProduto;
        }

        System.out.println("Quantidade de produtos: " + quantidadeProdutos);
        System.out.println("Valor de cada produto: R$ " + valorProduto);
        System.out.println("Total da compra: R$ " + totalCompra);
    }
}
