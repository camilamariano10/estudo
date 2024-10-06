package GerenciaFaculdade;

import java.util.HashMap;

public class Aluno {
    private String nome;
    private String matricula;
    private HashMap<String, Double> notasDisciplinas = new HashMap<>(); // Mapeia disciplinas para notas

    // Construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Método para adicionar ou atualizar a nota de uma disciplina
    public void adicionarNota(String disciplina, double nota) {
        notasDisciplinas.put(disciplina, nota);
    }

    // Método para exibir a nota em uma disciplina
    public void exibirNota(String disciplina) {
        Double nota = notasDisciplinas.get(disciplina);
        if (nota != null) {
            System.out.println("GerenciaFaculdade.Disciplina: " + disciplina + " | Nota: " + nota + " | Status: " + verificarStatus(nota));
        } else {
            System.out.println("O aluno não possui nota lançada para a disciplina " + disciplina);
        }
    }

    // Método para verificar o status (aprovado, recuperação ou reprovado)
    private String verificarStatus(double nota) {
        if (nota >= 7) {
            return "Aprovado";
        } else if (nota >= 4) {
            return "Em Recuperação";
        } else {
            return "Reprovado";
        }
    }

    // Método para exibir todas as notas
    public void exibirTodasNotas() {
        System.out.println("Notas de " + nome + ":");
        for (String disciplina : notasDisciplinas.keySet()) {
            exibirNota(disciplina);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
