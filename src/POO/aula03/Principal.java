package POO.aula03;

public class Principal {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();

        aviaoGol.totalAssentos = 100;

        aviaoGol.desativar();

        System.out.printf("Gol (%s): %d Assentos Disponiveis%n",
                aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDisponiveis());


    }
}
