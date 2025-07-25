package POO.aula04;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {

        double precoVendaCalculado = Matematica.calcularAcrecimo(produto.precoCusto, percentualMargemLucro);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;

    }
}
