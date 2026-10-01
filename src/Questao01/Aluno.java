package Questao01;

import java.util.Scanner;

public class Aluno {

    private String nome;
    private String matricula;
    private float notas [];

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new float[4];
    }

    public String getNome() {
        return nome;
    }

    public void cadastrarNotas () {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite sua nota " + (i + 1) + ": ");
            notas[i] = sc.nextFloat();
        }
    }

    public float calcularMedia () {

        float soma = 0;
        for (int i = 0; i < notas.length; i++){
            soma = soma + notas[i];
        }
        return soma / notas.length;
    }

    public boolean verificarAprovacao() {
        return calcularMedia() >= 7.0f;
    }
}
