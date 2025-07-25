package POO.aula03;

public class Aeronave {
    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }
}
