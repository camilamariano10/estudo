package Biblioteca1;

import java.util.ArrayList;

public class Bibliotecario extends Pessoa {
    protected ArrayList<Livro> livros = new ArrayList<>();

    public Bibliotecario(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    // Método para adicionar livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Biblioteca1.Biblioteca2.Livro adicionado: " + livro.getTitulo());
    }

    // Método para listar livros
    public void listarLivros() {
        System.out.println("Lista de Livros:");
        for (Livro livro : livros) {
            livro.exibirInformacoes();
        }
    }

    // Método para listar livros alugados
    public void listarLivrosAlugados() {
        System.out.println("Lista de Livros Alugados:");
        for (Livro livro : livros) {
            if (livro.isAlugado()) {
                livro.exibirInformacoes();
            }
        }
    }
}
