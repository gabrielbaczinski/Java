package FormativaRA;

import java.util.ArrayList;

public class PedidoJogo implements Pedido {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private double valor;

    public PedidoJogo(Double valor) {
        this.valor = valor;
    }

    @Override
    public void addProduto(Produto p) {
        produtos.add(p);
    }

    @Override
    public ArrayList getProdutos() {
        return produtos;
    }

    @Override
    public double calculaValorTotal() {
        double valorTotal = 0;
        for (Produto p : produtos) {
            valorTotal += p.getValor();
        }
        return valorTotal;
    }
}