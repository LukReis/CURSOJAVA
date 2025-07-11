package POO.aula03;

public class Produto {

    static double custoEmbalagem;
    double precoCusto;
    double precoVenda;

    void alterarPrecuCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    void imprimirCustoEmbalagem() {
        System.out.printf("Custo Com Embalagem %.2f%n", Produto.custoEmbalagem);
    }
}
