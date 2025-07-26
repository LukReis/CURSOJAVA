package cleanCode.boaspraticas;

public class CarrinhoDeCompra {
    public static final double TAXA_SERVICO_PADRAO = 0.10;

    int quantidadeItens;
    Produto produto;


    void realizarCompra(String numeroCartao) {
        double valorTotal = calcularValorTotal();

        boolean pagamentoAutorizado = GatewayPagamento.autorizarPagamento(numeroCartao, valorTotal);

        if (pagamentoAutorizado) {
            imprimirRecibo(valorTotal);
        }
    }

    void imprimirRecibo(double valorTotal) {
        System.out.println("RECIBO DE PAGAMENTO");
        System.out.printf("Valor Total: %.2f%n", valorTotal);
    }

    double calcularValorTotal() {
        double subtotal = calcularSubTotal();
        double taxaServiço = calcularTaxaServicos(subtotal);
        double valorTotal = subtotal + taxaServiço;
        return valorTotal;
    }

    double calcularTaxaServicos(double subtotal) {
        return subtotal * TAXA_SERVICO_PADRAO;
    }

    double calcularSubTotal() {
        return produto.precoUnitario * quantidadeItens;
    }
}
