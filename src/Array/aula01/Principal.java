package Array.aula01;

public class Principal {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Lucas";
        aluno1.idade = 25;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Nicoly";
        aluno2.idade = 22;

        turmaB.adicionarAluno(aluno1);
        turmaB.adicionarAluno(aluno2);

        turmaB.imprimirListaDeAlunos();

    }
}
