package Teoricas;

import java.util.Scanner;

public class avaliacaoAtendimento {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Avalie o nosso atendimento (1 a 5): ");
        int nota = entrada.nextInt();

        String descricaoNota;

        if (nota == 1) {

            descricaoNota = "Muito ruim";
        }
    }
}
