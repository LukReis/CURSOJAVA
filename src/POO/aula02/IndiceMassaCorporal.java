package POO.aula02;

public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

boolean estaComObesidade() {
    return resultado >= 30;
}

boolean estáAbaixoDoPesoIdeal() {
    return resultado < 18.5;
}

}
