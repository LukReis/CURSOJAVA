package Contrutores.com.algaworks.erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    private final String codigo;
    private String nome;
    private int quantidadeEstoque;

 public Produto() {
    this("sem nome");
    }

 public Produto(String nome) {
    this(nome, QUANTIDADE_ESTOQUE_INICIAL);

 }

 public Produto(String nome, int estoqueInicial) {
     Objects.requireNonNull(nome, "Nome é Obrigatorio!");

     if(estoqueInicial < 0) {
         throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
     }


     this.nome = nome;
     this.quantidadeEstoque = estoqueInicial;
     this.codigo = gerarCodigo();
 }

 private String gerarCodigo() {
     return UUID.randomUUID().toString();
 }

}
