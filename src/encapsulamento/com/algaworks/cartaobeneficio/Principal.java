package encapsulamento.com.algaworks.cartaobeneficio;

import encapsulamento.com.algaworks.cartaobeneficio.servico.ServicoDeDepositoPix;
import encapsulamento.com.algaworks.cartaobeneficio.servico.ServicoDePagamentoOnline;

public class Principal {
    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Mercadinho do Zé");
        var cartao = new Cartao("Nicoly Mota");

        var servicoDeposito = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servicoDeposito.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamentoOnline(supermercado, cartao,100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.obterTitular());
        System.out.printf("Saldo: %.2f%n", cartao.obterSaldo());

    }
}
