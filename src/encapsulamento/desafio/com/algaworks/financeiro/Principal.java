package encapsulamento.desafio.com.algaworks.financeiro;

public class Principal {
    public static void main(String[] args) {
        Fornecedor imobiliaria = new Fornecedor("Zé Negócios Imobiliários");

        ContaPagar contaAluguel = new ContaPagar();
        contaAluguel.setDescricao("Aluguel do apartamento");
        contaAluguel.setValor(4500);
        contaAluguel.setDataVencimento("10/07/2022");
        contaAluguel.setFornecedor(imobiliaria);

        imprimirConta(contaAluguel);
        contaAluguel.pagar();
        imprimirConta(contaAluguel);

        contaAluguel.cancelarPagamento();
        imprimirConta(contaAluguel);
        contaAluguel.cancelarPagamento();
        imprimirConta(contaAluguel);



    }

    public static void imprimirConta(ContaPagar conta) {
        System.out.printf("Fornecedor: %s%n", conta.getFornecedor().getNome());
        System.out.printf("Descrição: %s%n", conta.getDescricao());
        System.out.printf("Data de vencimento: %s%n", conta.getDataVencimento());
        System.out.printf("Valor: R$%.2f%n", conta.getValor());
        System.out.printf("Pago: %s%n", conta.isPago() ? "Sim" : "Não");
        System.out.println();
    }
}
