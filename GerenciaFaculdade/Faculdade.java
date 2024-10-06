package GerenciaFaculdade;

import java.util.ArrayList;

public class Faculdade {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    // Método para adicionar um aluno
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("GerenciaFaculdade.Aluno " + aluno.getNome() + " cadastrado com sucesso!");
    }

    // Método para adicionar um professor
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("GerenciaFaculdade.Professor " + professor.getNome() + " cadastrado com sucesso!");
    }

    // Método para adicionar uma disciplina
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        System.out.println("GerenciaFaculdade.Disciplina " + disciplina.getNome() + " cadastrada com sucesso!");
    }

    // Método para listar todas as disciplinas
    public void listarDisciplinas() {
        System.out.println("Disciplinas disponíveis:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- " + disciplina.getNome() + " (GerenciaFaculdade.Professor: " + disciplina.getProfessor().getNome() + ")");
        }
    }
}
