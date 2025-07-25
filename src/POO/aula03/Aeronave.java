package POO.aula03;

public class Aeronave {
    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void reservarAssentos(int numerosAssentos) {
        if (ativo) {
            assentosReservados += numerosAssentos;
        } else {
            System.out.println("Aeronave Desativada, Assentos não Reservados. ");
        }
    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }
}
