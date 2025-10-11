package Contrutores.Desafio01;

import java.util.Objects;

public class Participante {
    String nome;
    int saldoDePontos;



    Participante(String nome) {
        this(nome,0);
    }

    Participante(String nome, int saldoDePontosInicial) {
        Objects.requireNonNull(nome, "Nome é Obrigatorio");

        if (saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("O Saldo de Pontos não pode ser negativo");
        }

        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }

}
