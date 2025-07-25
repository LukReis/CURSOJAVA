package POO.aula03;

public class Principal {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();

        aviaoGol.totalAssentos = 100;

//        aviaoGol.desativar();
            aviaoGol.ativar();


        aviaoGol.reservarAssentos(10);
        System.out.printf("Gol (%s): %d Assentos Disponiveis%n",
                aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calcularAssentosDisponiveis());


        Aeronave aviaoLatam = new Aeronave();

        aviaoLatam.totalAssentos = 120;

//        aviaoGol.desativar();
        aviaoLatam.ativar();


        aviaoLatam.reservarAssentos(8);
        System.out.printf("LATAM (%s): %d Assentos Disponiveis%n",
                aviaoLatam.ativo ? "Ativo" : "Inativo", aviaoLatam.calcularAssentosDisponiveis());

    }
}
