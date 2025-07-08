package POO.aula01;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();

        Paciente colaborador = new Paciente();
        colaborador.peso = 175;
        colaborador.altura = 1.82;


        IndiceMassaCorporal imc = calculadoraImc.calcular(colaborador);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2fKG " + "Está com Obesidade %n", imc.altura, imc.peso);
        }
        System.out.printf("IMC: %.2f", imc.resultado);
    }
}
