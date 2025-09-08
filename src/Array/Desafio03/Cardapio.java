package Array.Desafio03;

import java.util.ArrayList;


public class Cardapio {
    ArrayList<ItemCardapio> itens = new ArrayList<>();

   ArrayList<ItemCardapio> consultarItensPorPreco(double precoMinimo, double precoMaximo) {
    ArrayList<ItemCardapio> itensEncontrados = new ArrayList<>();

    for (ItemCardapio item : itens) {
        if (item.possuiPrecoEntre(precoMinimo, precoMaximo)) {
            itensEncontrados.add(item);
        }
    }
        return itensEncontrados;
//    return itensEncontrados.isEmpty() ? null : itensEncontrados;
   }



    void adicionarItem(ItemCardapio item) {
        itens.add(item);

    }


    void removerItem(int indice) {
        itens.remove(indice);
    }


    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for (ItemCardapio item : itens) {
            if (item.possuiPrecoEntre(precoMinimo, precoMaximo)){
                item.imprimir();
            }
        }
    }
}
