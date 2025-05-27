package Desafios;

import java.util.Scanner;

public class Desafio09 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um Numero Primo: ");
        int numberPrimo = entrada.nextInt();


            if (numberPrimo <= 1) {
                System.out.println("O número " + numberPrimo + " não é primo.");
            } else {
                boolean ehPrimo = true;

                for (int i = 2; i <= Math.sqrt(numberPrimo); i++) {
                    if (numberPrimo % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }

                if (ehPrimo) {
                    System.out.println("O número " + numberPrimo + " é primo.");
                } else {
                    System.out.println("O número " + numberPrimo + " não é primo.");
                }
            }
        }
    }

