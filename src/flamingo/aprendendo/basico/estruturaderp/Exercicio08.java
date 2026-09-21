package flamingo.aprendendo.basico.estruturaderp;

public class Exercicio08 {
        public static void main(String[] args) {
            int quantidadeProdutos = 5;
            double valorProduto = 20.0;
            double totalCompra = 0; // Acumulador do preço

            for (int i = 1; i <= quantidadeProdutos; i++) {
                totalCompra += valorProduto; // Adiciona o preço de cada produto ao total
            }

            System.out.println("Quantidade de produtos: " + quantidadeProdutos);
            System.out.println("Valor de cada produto: R$ " + valorProduto);
            System.out.println("Total da compra: R$ " + totalCompra);
        }
    }

