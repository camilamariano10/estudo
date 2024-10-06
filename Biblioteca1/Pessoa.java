package Biblioteca1;

public class Pessoa {
    private String nome;
    private String email;
    private String senha;

    // Construtor
    public Pessoa(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Email: " + email);
    }
}
