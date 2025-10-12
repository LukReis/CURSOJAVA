package Contrutores.br.com.algamilhas.pontuacao;

import java.util.Objects;

public class Participante {
    private String nome;
    private int saldoDePontos;


   public Participante(String nome) {
        this(nome,0);
    }

    public Participante(String nome, int saldoDePontosInicial) {
        Objects.requireNonNull(nome, "Nome é Obrigatorio");

        if (saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("O Saldo de Pontos não pode ser negativo");
        }

        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }

    public void creditarPontos(int pontos) {
       if (pontos < 0) {
           throw new IllegalArgumentException("Pontos a Creditar não pode ser negativo");
       }

       this.saldoDePontos += pontos;
    }

}
