package POO.aula03;

public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    static double calcularCustoTotais(Produto produto) {
        return produto.precoCusto + Produto.custoEmbalagem;
    }

    void alterarPrecuCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    static void alterarCustoEmbalagem(double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

    static void imprimirCustoEmbalagem() {
        System.out.printf("Custo Com Embalagem %.2f%n", Produto.custoEmbalagem);
    }
}
