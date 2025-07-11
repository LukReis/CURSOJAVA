package POO.aula03;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        double precoVendaCalculado = produto.precoCusto * ((percentualMargemLucro / 100) +1);
        precoVendaCalculado += Produto.custoEmbalagem;
        produto.precoVenda = precoVendaCalculado;
    }
}
