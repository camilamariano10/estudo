package GerenciaFaculdade;

public class Main {
    public static void main(String[] args) {
        // Criando a faculdade
        Faculdade faculdade = new Faculdade();

        // Criando professores
        Professor prof1 = new Professor("Carlos", "Matemática");
        Professor prof2 = new Professor("Ana", "História");

        // Adicionando professores à faculdade
        faculdade.adicionarProfessor(prof1);
        faculdade.adicionarProfessor(prof2);

        // Criando disciplinas e associando aos professores
        Disciplina matematica = new Disciplina("Matemática", prof1);
        Disciplina historia = new Disciplina("História", prof2);

        // Adicionando disciplinas à faculdade
        faculdade.adicionarDisciplina(matematica);
        faculdade.adicionarDisciplina(historia);

        // Criando alunos
        Aluno aluno1 = new Aluno("João", "202301");
        Aluno aluno2 = new Aluno("Maria", "202302");

        // Adicionando alunos à faculdade
        faculdade.adicionarAluno(aluno1);
        faculdade.adicionarAluno(aluno2);

        // Matriculando alunos em disciplinas
        matematica.matricularAluno(aluno1);
        historia.matricularAluno(aluno2);

        // Listar disciplinas
        faculdade.listarDisciplinas();

        // GerenciaFaculdade.Professor lançando notas para alunos
        prof1.lancarNota(aluno1, 8.5);  // Aprovado
        prof2.lancarNota(aluno2, 5.0);  // Recuperação

        // GerenciaFaculdade.Aluno verificando suas notas
        aluno1.exibirTodasNotas();
        aluno2.exibirTodasNotas();
    }
}
