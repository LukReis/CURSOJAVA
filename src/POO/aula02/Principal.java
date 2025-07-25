package POO.aula02;

public class Principal {
    public static void main(String[] args) {

        CalculadoraImc paciente = new CalculadoraImc();
        Paciente joao = new Paciente();

        joao.peso = 97;
        joao.altura = 1.82;

        IndiceMassaCorporal imc = paciente.calcular(joao);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " + "Está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);

    }
}
