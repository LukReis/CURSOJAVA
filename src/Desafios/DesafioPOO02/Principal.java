package Desafios.DesafioPOO02;

public class Principal {
    public static void main(String[] args) {

        FolhaPagamento valorSalario = new FolhaPagamento();

        double salarioDevido = valorSalario.calcularSalario(160, 10, 51.8, 60.5);
        System.out.printf("Salario Devido: R$ %.2f%n", salarioDevido);
    }
}
