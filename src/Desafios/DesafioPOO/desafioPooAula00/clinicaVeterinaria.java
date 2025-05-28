package Desafios.DesafioPOO.desafioPooAula00;

public class clinicaVeterinaria {
    public static void main(String[] args) {

        Dog myDog = new Dog();

        myDog.nome = "Bettoven";
        myDog.raca = "Pitbull";
        myDog.sexo = "Macho";
        myDog.idade = 6;


        Dog youDog = new Dog();

        youDog.nome = "Pandora";
        youDog.raca = "Biggle";
        youDog.sexo = "Fêmea";
        youDog.idade = 2;


        System.out.println("Meu Dog");
        System.out.println("--------");
        System.out.printf("O nome do cachorro é: %s%n", myDog.nome);
        System.out.printf("A Raça do cachorro é: %s%n", myDog.raca);
        System.out.printf("O Sexo do cachorro é: %s%n", myDog.sexo);
        System.out.printf("A Idade do cachorro é: %d Anos %n", myDog.idade);

        System.out.println();

        System.out.println("You Dog");
        System.out.println("--------");
        System.out.printf("O nome do cachorro é: %s%n", youDog.nome);
        System.out.printf("A Raça do cachorro é: %s%n", youDog.raca);
        System.out.printf("O Sexo do cachorro é: %s%n", youDog.sexo);
        System.out.printf("A Idade do cachorro é: %d Anos %n", youDog.idade);









    }
}
