package encapsulamento.desafio.com.algaworks.financeiro;

import java.io.Serializable;
import java.util.Objects;

public class Fornecedor implements Serializable {
    private String nome;


    public Fornecedor() {
    }

    public Fornecedor(String nome) {
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
