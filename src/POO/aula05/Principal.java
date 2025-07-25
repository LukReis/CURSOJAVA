package POO.aula05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Visitante novoVisitante = new Visitante();

        System.out.print("Digite seu nome: ");
        novoVisitante.nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        novoVisitante.idade = sc.nextInt();

        if (novoVisitante.possuiAcessoRestritoPorIdade()) {
            System.out.printf("Acesso não permitido para menores de %d anos", Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO);
        } else {
            System.out.println("Acesso liberado");
        }


    }
}
