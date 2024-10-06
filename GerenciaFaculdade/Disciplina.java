package GerenciaFaculdade;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunosMatriculados = new ArrayList<>();

    // Construtor
    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    // Método para matricular aluno
    public void matricularAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
        System.out.println("GerenciaFaculdade.Aluno " + aluno.getNome() + " matriculado na disciplina " + nome);
    }

    // Método para listar alunos matriculados
    public void listarAlunos() {
        System.out.println("Alunos matriculados na disciplina " + nome + ":");
        for (Aluno aluno : alunosMatriculados) {
            System.out.println("- " + aluno.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }
}
