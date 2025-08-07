package cleanCode.cleanCode2;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        Produto produto = new Produto();
        produto.nome = "Água";
        produto.precoUnitario = 5;

        carrinho.adicionarItem(produto, 4);

        Endereco endereco = new Endereco();
        endereco.longadouro = "Rua das amoras";
        endereco.numero = "1000";
        endereco.bairro = "Centro";

        carrinho.gerarPedido(endereco);
    }
}
