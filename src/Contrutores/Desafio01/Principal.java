package Contrutores.Desafio01;

public class Principal {
    public static void main(String[] args) {
        Participante participante1 = new Participante("Lucas");
        Participante participante2 = new Participante("Nicoly",-200);

        System.out.println(participante1.nome);
        System.out.println(participante1.saldoDePontos);


        System.out.println(participante2.nome);
        System.out.println(participante2.saldoDePontos);


    }
}
