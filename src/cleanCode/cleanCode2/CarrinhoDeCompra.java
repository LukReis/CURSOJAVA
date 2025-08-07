package cleanCode.cleanCode2;

import java.util.Objects;

public class CarrinhoDeCompra {

        Produto produto;
        int quantidadeItens;

        void adicionarItem(Produto produto, int quantidade) {

            Objects.requireNonNull(produto, "Produto deve ser informado");

            if (quantidade <= 0) {
                throw new IllegalArgumentException("Quantidade deve ser mais que 0");
            }

            System.out.printf("Produto: %s%n", produto.nome);
        }

        void gerarPedido(Endereco enderecoEntrega) {
            Objects.requireNonNull(enderecoEntrega, "Endereço de Entrega");
            criarNovoPedido(enderecoEntrega);
    }

        void gerarPedido() {
           criarNovoPedido(null);
    }

        private void criarNovoPedido(Endereco enderecoEntrega) {

    }
}
