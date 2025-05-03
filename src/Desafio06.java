import java.util.Scanner;

public class Desafio06 {
    public static void main (String[] args) {

        System.out.println("Digite seu Gênero:");
        System.out.println("1 = Mulher - 2 = Homem");

        Scanner generoImc = new Scanner(System.in);

        int genero = generoImc.nextInt();

        System.out.println(" Calculadora de IMC ");
        System.out.println("____________________");



        Scanner entradaImc = new Scanner(System.in);
        System.out.print("Digite seu peso:");
        int peso = entradaImc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entradaImc.nextDouble();


        double imc = peso / (altura * altura);









    }
}
