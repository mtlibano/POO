package atvpoo.arrays;

import java.util.Arrays;

public class exe01 {
    public static void main(String[] args) {

        double[] notas = {8, 6, 7, 9, 10};
        double soma = 0;

        Arrays.sort(notas);

        for (int i = (notas.length - 1); i >= 0; i--) {
            System.out.println(notas[i]);
            soma += notas[i];
        }

        System.out.println("Média: " + soma / notas.length);

    }
}