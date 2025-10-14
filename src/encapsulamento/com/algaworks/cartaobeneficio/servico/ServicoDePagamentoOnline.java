package encapsulamento.com.algaworks.cartaobeneficio.servico;


import encapsulamento.com.algaworks.cartaobeneficio.Cartao;
import encapsulamento.com.algaworks.cartaobeneficio.Estabelecimento;
import encapsulamento.com.algaworks.cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamentoOnline(Estabelecimento estabelecimento, Cartao cartao, double valor) {

        cartao.debitar(valor);

        return new Recibo(cartao.obterTitular(), "Pagamento", valor);
    }
}
