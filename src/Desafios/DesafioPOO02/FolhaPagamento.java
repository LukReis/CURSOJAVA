package Desafios.DesafioPOO02;

public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras, double valorHorasNormais, double valorHorasExtras) {

    double valorHoraNormal = horasNormais * valorHorasNormais;
    double valorHoraExtra = horasExtras * valorHorasExtras;

    return valorHoraExtra + valorHoraNormal;

    }
}
