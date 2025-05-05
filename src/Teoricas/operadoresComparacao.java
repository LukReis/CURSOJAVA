public class operadoresComparacao {
    public static void main (String []args ) {
        int pesoProdutos = 900;
        int limitePesoCaminhao = 1000;


        boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
        boolean cargaLiberada = limitePesoCaminhao >= pesoProdutos;



        System.out.printf("Carga excedida: %b%n ", cargaExcedida);
        System.out.printf("Carga Liberada: %b%n ", cargaLiberada);

    }
}
