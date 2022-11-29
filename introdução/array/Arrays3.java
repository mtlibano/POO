package br.com.max.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numero = new int[5];

        int[] numero2 = {1, 2, 3, 4, 5};

        int[] numero3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numero2.length; i++) {
            System.out.println(i + " = " + numero2[i]);
        }

        // foreach

        for (int aux : numero2) {
            System.out.println(aux);
        }


    }
}
