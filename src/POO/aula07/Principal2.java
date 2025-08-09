package POO.aula07;

import java.util.Objects;

public class Principal2 {
    public static void main(String[] args) {
        Integer idade = null;


        Objects.requireNonNull(idade, "Idade não pode ser nula");

        System.out.println(idade + 10);
        System.out.println(idade == 100);
        System.out.println(idade.equals(100));


    }
}
