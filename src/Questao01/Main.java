package Questao01;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Gustavo", "001");
        Aluno aluno2 = new Aluno("Davi", "002");

        aluno1.cadastrarNotas();
        aluno2.cadastrarNotas();

        Aluno alunos [] = {aluno1, aluno2};

        Turma turma = new Turma(alunos);

        turma.listarAprovados();
        turma.listarReprovados();

    }
}
