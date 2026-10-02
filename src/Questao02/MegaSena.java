package Questao02;

import java.util.Arrays;

public class MegaSena {

    private int numeros[] = new int[6];
    private int qntd = 0;

    public boolean contem (int n) {
        for (int i = 0; i < qntd; i++) {
            if (numeros[i] == n) return true;
        }
        return false;
    }
    public boolean adicionar (int n) {
        if (n < 1 || n > 60 || contem(n) || qntd == 6) {
            return false;
        }
        numeros[qntd++] = n;
        return true;
    }

    public boolean completo() {
        return qntd == 6;
    }
    public int[] getOrdenados() {
        int[] copia = Arrays.copyOf(numeros, qntd);
        Arrays.sort(copia);
        return copia;
    }
}
