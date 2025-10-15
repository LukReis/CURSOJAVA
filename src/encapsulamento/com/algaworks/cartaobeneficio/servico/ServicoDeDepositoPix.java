package encapsulamento.com.algaworks.cartaobeneficio.servico;

import encapsulamento.com.algaworks.cartaobeneficio.Cartao;
import encapsulamento.com.algaworks.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {

     cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Deposito", valorDeposito);

    }

}
