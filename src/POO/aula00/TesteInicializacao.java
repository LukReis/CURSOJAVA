package POO.aula00;

public class TesteInicializacao {
    public static void main(String[] args) {

        Proprietario pessoa1 = new Proprietario();
        pessoa1.nome = "João";

        Proprietario pessoa2 = new Proprietario();
        pessoa2.nome = "Pedro";

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "HR-V";
        meuCarro.proprietario = pessoa1;

        Carro seuCarro = new Carro();
        seuCarro.modelo = "X6";

        meuCarro.proprietario = pessoa1;
        seuCarro.proprietario = pessoa1;

        meuCarro.proprietario.nome = "Sebastião";

        System.out.println(meuCarro.proprietario.nome);
        System.out.println(meuCarro.proprietario.nome);

       // System.out.println(pessoa1.nome);

       // meuCarro.proprietario.nome = "Marcos";
       // System.out.println(pessoa1.nome);

    }
}
