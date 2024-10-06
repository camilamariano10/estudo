package Biblioteca1;

public class Livro {
    private String titulo;
    private String autor;
    private boolean alugado;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.alugado = false;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void alugar() {
        this.alugado = true;
    }

    public void devolver() {
        this.alugado = false;
    }

    // Exibir informações do livro
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Alugado: " + (alugado ? "Sim" : "Não"));
    }
}
