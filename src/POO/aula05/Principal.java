package POO.aula05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var novoVisitante = new Visitante();

        System.out.print("Digite seu nome: ");
        novoVisitante.nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        novoVisitante.idade = sc.nextInt();


    var cadastroPortaria = new CadastroPortaria();
    cadastroPortaria.cadastrar(novoVisitante, 10);
    cadastroPortaria.cadastrar(novoVisitante);


    }
}
