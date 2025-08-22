package Array.aula02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

    ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Lucas");
        alunos.add("Nicoly");




//    alunos[0] = "Lucas";
//    alunos[1] = "Nicoly";

        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            System.out.println(aluno);
        }
        System.out.println("---------");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

    }








}
