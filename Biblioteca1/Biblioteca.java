package Biblioteca1;

public class Biblioteca {
    private Bibliotecario bibliotecario;

    public Biblioteca(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    // Método para alugar um livro
    public void alugarLivro(Pessoa pessoa, String titulo) {
        for (Livro livro : bibliotecario.livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isAlugado()) {
                livro.alugar();
                System.out.println(pessoa.getNome() + " alugou o livro: " + titulo);
                return;
            }
        }
        System.out.println("Biblioteca1.Biblioteca2.Livro não disponível para aluguel.");
    }

    // Método para devolver um livro
    public void devolverLivro(Pessoa pessoa, String titulo) {
        for (Livro livro : bibliotecario.livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isAlugado()) {
                livro.devolver();
                System.out.println(pessoa.getNome() + " devolveu o livro: " + titulo);
                return;
            }
        }
        System.out.println("Este livro não está alugado.");
    }
}
