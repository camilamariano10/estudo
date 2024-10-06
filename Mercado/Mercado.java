package Mercado;

import java.util.ArrayList;

public class Mercado {
    private ArrayList<Produto> produtos = new ArrayList<>();

    // Método para adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Mercado.Produto adicionado: " + produto.getNome());
    }

    // Método para listar todos os produtos
    public void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
        }
    }

    // Método para remover um produto
    public void removerProduto(String nomeProduto) {
        produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nomeProduto));
        System.out.println("Mercado.Produto removido: " + nomeProduto);
    }
}
