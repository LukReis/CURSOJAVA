package Desafios.DesafioPOO02;

public class Principal {
    public static void main(String[] args) {

        FolhaPagamento valorSalario = new FolhaPagamento();

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Lucas Mota";
        funcionario.quantidadeDeFilhos = 2;

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = funcionario;
        contrato.ValorHoraNormal = 55.4;
        contrato.valorHoraExtra = 67.84;


        Holerite holerite = valorSalario.calcularSalario(160, 10, contrato);
        holerite.imprimir();
    }
}

