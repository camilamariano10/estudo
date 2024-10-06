package Biblioteca1;

public class Main2 {
    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario("João", "joao@biblioteca.com", "senha123");
        Biblioteca biblioteca = new Biblioteca(bibliotecario);

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");
        Livro livro2 = new Livro("1984", "George Orwell");
        bibliotecario.adicionarLivro(livro1);
        bibliotecario.adicionarLivro(livro2);

        Pessoa cliente = new Pessoa("Maria", "maria@gmail.com", "senha456");

        // Listar livros disponíveis
        bibliotecario.listarLivros();

        // Alugar um livro
        biblioteca.alugarLivro(cliente, "1984");

        // Tentar alugar o mesmo livro novamente
        biblioteca.alugarLivro(cliente, "1984");

        // Listar livros alugados
        bibliotecario.listarLivrosAlugados();

        // Devolver o livro
        biblioteca.devolverLivro(cliente, "1984");

        // Listar livros alugados após devolução
        bibliotecario.listarLivrosAlugados();
    }
}
