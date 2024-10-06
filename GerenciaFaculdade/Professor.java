package GerenciaFaculdade;

public class Professor {
    private String nome;
    private String disciplina;

    // Construtor
    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    // Método para lançar nota para um aluno
    public void lancarNota(Aluno aluno, double nota) {
        aluno.adicionarNota(disciplina, nota);
        System.out.println("Nota lançada com sucesso para o aluno " + aluno.getNome() + " na disciplina " + disciplina + ": " + nota);
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
