package flamingo.aprendendo.basico.estruturaderp;

public class Exercicio07 {
        public static void main(String[] args) {
            int quantidadeVendas = 8;
            double valorVenda = 50.0;
            double faturamentoTotal = 0; // Acumulador

            for (int i = 1; i <= quantidadeVendas; i++) {
                faturamentoTotal += valorVenda; // Soma o valor de cada venda
            }

            System.out.println("Quantidade de vendas: " + quantidadeVendas);
            System.out.println("Faturamento total: R$ " + faturamentoTotal);
        }
    }

