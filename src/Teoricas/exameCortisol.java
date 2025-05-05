import java.util.Scanner;

public class exameCortisol {
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Cortisol: ");
        double cortisol = entrada.nextDouble();

        //Cortisol ideal é de 6 a 18.4

        boolean resultadoNormal = cortisol >= 6 && cortisol <= 18.4;
        System.out.printf("Cortisol Normal: %b%n", resultadoNormal);

        boolean resultadoAnormal = cortisol < 6 || cortisol > 18.4;
        System.out.printf("Cortisol Anormal: %b%n", resultadoAnormal);




    }
}
