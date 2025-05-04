import java.util.Scanner;

public class Desafio06 {
    public static void main (String[] args) {

        System.out.println("____________________");
        System.out.println(" Calculadora de IMC ");
        System.out.println("____________________");

        Scanner nameImc = new Scanner(System.in);
        System.out.print("Digite Seu Nome: ");
        String name = nameImc.nextLine();


        System.out.println("Digite seu Gênero: ");
        System.out.println("1 = Mulher - 2 = Homem ");

        Scanner generoImc = new Scanner(System.in);
        int genero = generoImc.nextInt();


        Scanner entradaImc = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        int peso = entradaImc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entradaImc.nextDouble();


        double imc = peso / (altura * altura);

        if (genero == 1 && imc < 19.1) {
            System.out.printf(" %s Seu imc é: %.2f.%n",name, imc);
            System.out.printf(" %s você está Abaixo do Peso. ", name);
        } else if (genero == 1 && imc <= 25.8 ) {
            System.out.printf(" %s Seu imc é: %.2f.%n",name, imc);
            System.out.printf(" %s você está no Peso Ideal. ", name);
        } else if (genero == 1 && imc <= 27.3) {
            System.out.printf(" %s Seu imc é: %.2f.%n",name, imc);
            System.out.printf(" %s você está um pouco acima do Peso Ideal. ", name);
        } else if (genero == 1 && imc <= 32.3) {
            System.out.printf(" %s Seu imc é: %.2f.%n",name, imc);
            System.out.printf(" %s você está acima do Peso Ideal. ", name);
        } else if (genero == 1 && imc > 32.3){
            System.out.printf(" %s Seu imc é: %.2f.%n",name, imc);
            System.out.printf(" %s você está em Obesidade. ", name);
        }


        if (genero == 2 && imc < 20.7) {
            System.out.printf(" %s Seu imc é: %.2f.%n",name, imc);
            System.out.printf(" %s você está Abaixo do Peso. ", name);
        } else if (genero == 2 && imc <= 26.40 ) {
            System.out.printf(" %s Seu imc é: %.2f.%n",name, imc);
            System.out.printf(" %s você está no Peso Ideal. ", name);
        } else if (genero == 2 && imc <= 27.80) {
            System.out.printf(" %s Seu imc é: %.2f.%n",name, imc);
            System.out.printf(" %s você está um pouco acima do Peso Ideal. ", name);
        } else if (genero == 2 && imc <= 31.1) {
            System.out.printf(" %s Seu imc é: %.2f.%n",name, imc);
            System.out.printf(" %s você está acima do Peso Ideal. ", name);
        } else if (genero == 2 && imc > 31.1){
            System.out.printf(" %s Seu imc é: %.2f.%n",name, imc);
            System.out.printf(" %s você está em Obesidade. ", name);
        }

    }
}
