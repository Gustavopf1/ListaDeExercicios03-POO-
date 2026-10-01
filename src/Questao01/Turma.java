package Questao01;

public class Turma {

    private Aluno alunos [];

    public Turma (Aluno alunos[]) {
        this.alunos = alunos;
    }
    public void listarAprovados (){

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < alunos.length; i++){

            if (alunos[i].verificarAprovacao()) {
                System.out.println(alunos[i].getNome());
            }
        }
    }

    public void listarReprovados () {

        System.out.println("Alunos reprovados:");
        for (int i = 0; i < alunos.length; i++) {

            if (!alunos[i].verificarAprovacao()) {
                System.out.println(alunos[i].getNome());
            }
        }
    }
}
