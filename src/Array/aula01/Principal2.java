package Array.aula01;

import java.util.Arrays;

public class Principal2 {
    public static void main(String[] args) {

        int[] numeroJogo1 = { 25, 11, 8, 46, 37, 14};

        int[] numeroJogo2 = Arrays.copyOf(numeroJogo1, numeroJogo1.length + 1);

        numeroJogo2[numeroJogo2.length - 1] = 44;

        System.out.println(Arrays.toString(numeroJogo1));
        System.out.println(Arrays.toString(numeroJogo2));

    }
}
