import java.util.Scanner;

public class Desafio05 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);

    System.out.printf("Digite seu Ano: ");

    int entradaAno = entrada.nextInt();

    boolean anoBissexto = (entradaAno %4 == 0) || (entradaAno %400 ==0);
    System.out.printf("O Ano é Bissexto?: %b%n", anoBissexto);








    }
}
