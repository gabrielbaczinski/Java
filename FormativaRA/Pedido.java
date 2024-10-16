package FormativaRA;

import java.util.ArrayList;

public interface Pedido {
    void addProduto(Produto p);
    ArrayList getProdutos();
    double calculaValorTotal();

}
