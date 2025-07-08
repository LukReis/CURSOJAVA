package Desafios.DesafioPOO02;

public class ContratoTrabalho {
    Funcionario funcionario;
    double valorHoraExtra;
    double ValorHoraNormal;

    boolean possuiAdicionalParaFilhos() {
        return funcionario.funcionarioPossuiFilhos();
    }
}
