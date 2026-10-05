package Questao03;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de n: ");
        int n = sc.nextInt();

        long[] serie = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                serie[i] = 0;
            } else if (i == 1) {
                serie[i] = 1;
            } else {
                serie[i] = serie[i - 1] + serie[i - 2];
            }
        }
        System.out.println(Arrays.toString(serie));
        sc.close();
    }
}
