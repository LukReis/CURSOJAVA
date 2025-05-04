import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Valor por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Horas Trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        System.out.print("Valor dos descontos: ");
        double valorDesconto = entrada.nextDouble();

        double salario = valorHora * horasTrabalhadas;
        double totalSalario = salario - valorDesconto;

        System.out.println("---------------------------------------------");
        System.out.println("- Bem Vindo ao Resumo da Folha de Pagamento -");
        System.out.println(" ");
        System.out.printf("Folha de Pagamento: %s%n", nome);
        System.out.printf("%d horas x R$%.2f = R$%.2f%n", horasTrabalhadas, valorHora, salario);
        System.out.printf("Descontos: %.2f%n", valorDesconto);
        System.out.printf("Total devido: %.2f%n", totalSalario);
        System.out.println("---------------------------------------------");


    }
}
/*

A empresa que você trabalha descobriu que você está indo muito bem neste
curso de Java e pediu para que você desenvolvesse um programa que calcula
os pagamentos para os prestadores de serviços da empresa.
Este programa deve receber as seguintes entradas de dados do usuário:

• Nome (texto)
• Valor por hora (decimal)
• Horas trabalhadas (inteiro)
• Valor dos descontos (decimal)

A saída do programa deve ser um resumo da folha de pagamento, mostrando os
cálculos e os resultados finais, como no exemplo abaixo:

Folha de pagamento: Thiago Faria
172 horas x R$150.20 = R$25834.40
Descontos: R$482.88
Total devido: R$25351.52

Use a formatação de saída com printf para imprimir na saída e o
tipo Scanner para receber a entrada de dados do usuário.




 */