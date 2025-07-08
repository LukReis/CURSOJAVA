package Desafios.DesafioPOO02;

public class Principal {
    public static void main(String[] args) {

        FolhaPagamento valorSalario = new FolhaPagamento();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Lucas Mota";
        funcionario.quantidadeDeFilhos = 5;

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = funcionario;
        contrato.ValorHoraNormal = 55.4;
        contrato.valorHoraExtra = 67.84;


        double salarioDevido = valorSalario.calcularSalario(160, 10, contrato);
        System.out.printf("Salario Devido: R$ %.2f%n", salarioDevido);
    }
}

//Salario Devido: R$ 9542,40