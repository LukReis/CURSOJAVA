package POO.aula04;

public class Principal {
    public static void main(String[] args) {

        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "Lucas";
        novoVisitante.idade = 16;

       CadastroPortaria cadastroPortaria = new CadastroPortaria();
       cadastroPortaria.cadastrar(novoVisitante, 10);

       cadastroPortaria.cadastrar(novoVisitante, 2);

    }

}
