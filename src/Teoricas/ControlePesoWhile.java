package Teoricas;

import java.util.Scanner;

public class ControlePesoWhile {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso Maximo da aeronave: ");
        int pesoMaximo = entrada.nextInt();

        int pesoTotalPassageiros = 0;
        boolean incluirNovoPassageiro = true;

        while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
            System.out.print("Peso do passageiro: ");
            int pesoPassageiro = entrada.nextInt();

            pesoTotalPassageiros +=  pesoPassageiro;

            System.out.print("Incluir Novo Passageiro? ");
            incluirNovoPassageiro = entrada.nextBoolean();
        }
        System.out.printf("Peso Máximo da aeronave: %d KG%n", pesoMaximo);
        System.out.printf("Peso Total dos passageiros: %d KG%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n", pesoTotalPassageiros > pesoMaximo ? "Peso excedido" : "Liberada");

    }
}
