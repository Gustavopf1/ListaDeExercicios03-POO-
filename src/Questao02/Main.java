package Questao02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MegaSena jogo = new MegaSena();

        while (!jogo.completo()) {
            System.out.print("Digite um número (1 a 60): ");
            int n = sc.nextInt();

            if (!jogo.adicionar(n)) {
                System.out.println("Número inválido ou repetido! Tente outro.");
            }
        }

        System.out.println("Números ordenados: " + Arrays.toString(jogo.getOrdenados()));
        sc.close();
    }
}
