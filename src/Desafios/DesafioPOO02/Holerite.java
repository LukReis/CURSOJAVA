package Desafios.DesafioPOO02;

import java.sql.SQLOutput;

public class Holerite {
    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    double calcularValorTotal() {
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    void imprimir(){
        System.out.println("HOLERITE");
        System.out.println("--------");
        System.out.printf("Nome do Funcionário: %s%n", funcionario.nome);
        System.out.printf("Valor das Horas Normais: %.2f%n", valorTotalHorasNormais);
        System.out.printf("Valor das Horas Extras: %.2f%n", valorTotalHorasExtras);
        System.out.printf("Valor Adicional para filhos: %.2f%n", valorAdicionalFilhos);
        System.out.printf("Valor Total: %.2f%n", calcularValorTotal());
    }
}
