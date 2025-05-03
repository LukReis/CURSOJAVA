
public class exemploBoolean {
    public static void  main (String[] args) {
        boolean compraAprovada = true;
        boolean clienteBloqueado = false;



        System.out.println(compraAprovada);
        System.out.println(clienteBloqueado);

        int quatidadeEstoque = 10;
        int quantidadePedidoCompra = 9;

        boolean estoqueSuficiente = quatidadeEstoque >= quantidadePedidoCompra;

        System.out.println("Estoque suficiente: " + estoqueSuficiente);

    }
}
