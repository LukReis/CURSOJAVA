package Teoricas;

import java.util.Scanner;

public class ControlePesoWhile {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso Maximo da aeronave: ");
        int pesoMaximo = entrada.nextInt();

        int pesoTotalPassageiros = 0;


        while (true) {
            System.out.print("Peso do passageiro: ");
            int pesoPassageiro = entrada.nextInt();

            if (pesoTotalPassageiros + pesoPassageiro > pesoMaximo) {
                System.out.println("Não Pode incluir Passageiro. Peso excederia o máximo. ");

            } else {
                pesoTotalPassageiros += pesoPassageiro;

                System.out.print("Incluir Novo Passageiro? ");
                if (!entrada.nextBoolean()) {
                    break;
                }
            }
        }
        System.out.printf("Peso Máximo da aeronave: %d KG%n", pesoMaximo);
        System.out.printf("Peso Total dos passageiros: %d KG%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n", pesoTotalPassageiros > pesoMaximo ? "Peso excedido" : "Liberada");

    }
}
