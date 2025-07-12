package POO.aula04;

public class Visitante {
    String nome;
    int idade;

    static final int IDADE_MINIMA_ACESSO_IRRESTRITO = 18;

    boolean possuiAcessoRestridoPorIdade() {
        return idade < IDADE_MINIMA_ACESSO_IRRESTRITO;
    }
}
