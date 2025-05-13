package Desafios;

import java.util.Scanner;

public class Desafio07 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Valor do Empréstimo: ");
        double valorEmprestimo = entrada.nextDouble();

        System.out.print("Quantidade de Parcelas: ");
        int quantidadeParcelas = entrada.nextInt();

        double taxaJuros = switch (quantidadeParcelas) {
            case 1, 2 -> valorEmprestimo * 0.0199;
            case 3 -> valorEmprestimo * 0.0299;
            default -> valorEmprestimo * 0.0399;

        };

        double tarifaFixa = valorEmprestimo >= 100 ? + 1.50 : 0;

        double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
        double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;


        System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
        System.out.printf("Total de Juros: R$%.2f%n", totalJuros);
        System.out.printf("Custo Total: R$%.2f%n", custoTotal);

    }
}
