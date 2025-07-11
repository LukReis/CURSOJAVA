package POO.aula03;

public class Principal {
    public static void main(String[] args) {
        Produto novoProduto = new Produto();
        Produto.custoEmbalagem = 10;
//        novoProduto.precoCusto = 100;
        novoProduto.alterarPrecuCusto(100);


        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de Custo %.2f%n ", novoProduto.precoCusto);
        System.out.printf("Preço de Venda: %.2f%n ", novoProduto.precoVenda);

    }
}
