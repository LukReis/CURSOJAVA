package Desafios;

import java.util.Scanner;

public class Desafio08 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;


        for (int numerosPrimos = 1; numerosPrimos <= 10; ) {

                System.out.printf("Digite 10 números Desejado (%d/10): ", numerosPrimos);
                int numberPar = entrada.nextInt();

                if (numberPar % 2 == 0) {
                    numerosPrimos++;
                    soma += numberPar;
                } else {
                    System.out.println("Por favor digite números Pares! ");
                }


        }

        System.out.printf("A soma dos números digitados é: %d%n", soma);





    }
}
