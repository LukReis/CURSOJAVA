package POO.aula00;

public class Principal {
    public static void main(String[] args) {
        Proprietario eu = new Proprietario();
        eu.nome = "Lucas Mota";
        eu.cpf = "000.000.000-89";
        eu.anoNascimento = 2000;

        Proprietario voce = new Proprietario();
        voce.nome = "Nicoly Reis";
        voce.cpf = "000.000.000-89";
        voce.anoNascimento = 2002;

        Carro meuCarro = new Carro();

        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Honda";
        meuCarro.precoCompra = 0;
        meuCarro.modelo = "HR-V";
        meuCarro.proprietario = eu;

        Carro seuCarro = new Carro();

        seuCarro.anoFabricacao = 2022;
        seuCarro.cor = "Branco";
        seuCarro.fabricante = "BMW";
        seuCarro.modelo = "X6";
        seuCarro.precoCompra = 980000;
        seuCarro.proprietario = voce;

        double ipva = meuCarro.calcularIpva();
        System.out.println(ipva);

        meuCarro.imprimirResumoDepreciacao();


//        System.out.println("Meu Carro");
//        System.out.println("----------");
//        System.out.printf("Modelo: %s%n", meuCarro.modelo);
//        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
//        System.out.printf("Ano: %s%n", meuCarro.proprietario.nome);
//
//        System.out.println();
//
//        System.out.println("Seu Carro");
//        System.out.println("----------");
//        System.out.printf("Modelo: %s%n", seuCarro.modelo);
//        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Ano: %s%n", seuCarro.proprietario.nome);
    }
}
