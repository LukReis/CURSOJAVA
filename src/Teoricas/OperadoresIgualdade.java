public class OperadoresIgualdade {
    public static void main (String[] args) {

        boolean numerosIguais = (4 + 6) == (5 * 2);

        int numero1 = 10;
        int numero2 = 11;
        boolean numerosIguais2 = numero1 == 10;


        boolean numerosDiferentes = !numerosIguais2;
        boolean numerosDiferentes2 = !(numero1 == numero2);

        // System.out.printf("numerosIguais: %b%n", numerosIguais);
        // System.out.printf("numerosIguais: %b%n", numerosDiferentes);

        //System.out.printf("numerosIguais: %b%n", numerosIguais2);

        System.out.printf("numeros Iguais: %b%n", numerosDiferentes2);

        }
}
