package Desafios.DesafioPOO02;

public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato) {
    Funcionario funcionario = new Funcionario();
    double valorHoraNormal = horasNormais * contrato.ValorHoraNormal;
    double valorHoraExtra = horasExtras * contrato.valorHoraExtra;

    double valorTotal = valorHoraExtra + valorHoraNormal;

    if (funcionario.funcionarioPossuiFilhos()){
        return valorTotal *= 1.10;
    }

    return valorTotal;

    }
}
