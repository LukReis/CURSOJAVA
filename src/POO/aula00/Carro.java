package POO.aula00;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;

   Proprietario proprietario;



   double calcularIpva() {
       int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

       if (tempoDeUsoEmAnos >= 10) {
           return 0;
       }
       return calcularValorRevenda() * 0.04;
   }

   void imprimirResumoDepreciacao() {
       double valorRevendaMeuCarro = calcularValorRevenda();
       int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        if (precoCompra <= 0) {
            System.out.println("Carro com preço de compra zerado. não foi possível imprimir resumo de depreciação");
            return;
        }

       System.out.printf("Tempor de Uso em (Anos): %d%n", tempoDeUsoMeuCarro);
       System.out.printf("Valor de Revenda %6.2f%n", valorRevendaMeuCarro);
   }

   int calcularTempoDeUsoEmAnos() {
       return 2022 - anoFabricacao;
   }

   double calcularValorRevenda() {
       int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
       int vidaUtilEmAnos = 20;
       double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

       if (valorRevenda < 0) {
           valorRevenda = 0;
       }

       return valorRevenda;
   }
}
