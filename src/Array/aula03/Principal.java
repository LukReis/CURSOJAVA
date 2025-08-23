package Array.aula03;

public class Principal {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.numero = 123;
        fatura.valorTotal = 1_293.55;

        ServicoCobranca servicoDeCobranca = new ServicoCobranca();

       // String[] emailsCobranca = {"joao@algaworks.com", "maria@algaworks.com"};
//        servicoDeCobranca.pagar(fatura, emailsCobranca);

//        servicoDeCobranca.pagar(fatura,
//                new String[]{"joao@algaworks.com", "maria@algaworks.com"});

//        servicoDeCobranca.pagar(fatura, new String[0]);
//        servicoDeCobranca.pagar(fatura, new String[]{});

        servicoDeCobranca.pagar(fatura, "joao@algaworks.com", "maria@algaworks.com");
//        servicoDeCobranca.pagar(fatura);
    }
}
