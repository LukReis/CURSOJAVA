package POO.aula04;

public class Principal3 {
    public static void main(String[] args) {
        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecoCusto(100);

        System.out.printf("Totl de custos: %.2f%n", Produto.calcularCustoTotais(produto));
    }
}
