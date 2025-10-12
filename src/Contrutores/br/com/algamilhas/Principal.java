package Contrutores.br.com.algamilhas;

import Contrutores.br.com.algamilhas.pontuacao.Participante;

public class Principal {
    public static void main(String[] args) {
        Participante participante1 = new Participante("Lucas");
        Participante participante2 = new Participante("Nicoly",200);

        participante1.creditarPontos(100);
        participante2.creditarPontos(3000);


    }
}
