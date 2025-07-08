package Desafios.DesafioPOO02;

public class FolhaPagamento {

    Holerite calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato) {
    Holerite holerite = new Holerite();
    holerite.funcionario = contrato.funcionario;
    holerite.valorTotalHorasNormais = horasNormais * contrato.ValorHoraNormal;
    holerite.valorTotalHorasExtras = horasExtras * contrato.valorHoraExtra;

    double subtotal = holerite.valorTotalHorasNormais +  holerite.valorTotalHorasExtras;

    if (contrato.possuiAdicionalParaFilhos()){
        holerite.valorAdicionalFilhos = subtotal *= 0.10;
    }

    return holerite;
    }
}
