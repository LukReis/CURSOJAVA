package POO.aula03;

public class Principal3 {
    public static void main(String[] args) {
        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecuCusto(100);

        System.out.printf("Total de Custos %.2f%n", Produto.calcularCustoTotais(produto));
        System.out.printf("Total Preço venda: %.2f%n", Matematica.calcularAcrecimo(Produto.calcularCustoTotais(produto), 20));
    }
}
