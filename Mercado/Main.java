package Mercado;

public class Main {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        Produto p1 = new Produto("Arroz", 5.50, 10);
        Produto p2 = new Produto("Feijão", 6.20, 15);

        mercado.adicionarProduto(p1);
        mercado.adicionarProduto(p2);

        mercado.listarProdutos();

        mercado.removerProduto("Feijão");
        mercado.listarProdutos();
    }
}
