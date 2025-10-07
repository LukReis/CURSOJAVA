package GerenciamentoDeMemoria;

public class teste2 {
    public static void main(String[] args) {
        imprimirUsoMemoria();

        byte[] x =  new byte[500 * 1024 * 1024];
        byte[] y = new byte[500 * 1024 * 1024];
        imprimirUsoMemoria();

        x = y;
        System.gc();


        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria() {
        System.out.printf("Maxima: %s%n",emMegaBytes(Runtime.getRuntime().maxMemory()));

        System.out.printf("Total Empenhada: %s%n",emMegaBytes(Runtime.getRuntime().totalMemory()));

        System.out.printf("Disponivel: %s%n",emMegaBytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.printf("Usada: %s%n",emMegaBytes(memoriaUsada));

        System.out.println("-----------------------------------");

    }

    static String emMegaBytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d / 1024d );
    }
}
