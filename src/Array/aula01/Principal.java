package Array.aula01;

public class Principal {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";
        turmaB.alunos = new Aluno[3];

        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "João";
        turmaB.alunos[0].idade = 18;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Lucas";
        aluno1.idade = 25;

        turmaB.alunos[1] = aluno1;
    }
}
