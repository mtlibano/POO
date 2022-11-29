package atvpoo.arrays;

import java.util.Random;

public class exe05 {
    public static void main(String[] args) {
        int[] par = new int[10];
        int[] impar = new int[10];
        int test = 0;

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            test = random.nextInt(1, 21);
            if (test % 2 == 0) {
                par[i] = test;
            } else {
                impar[i] = test;
            }
        }

        System.out.print("Array par: ");
        for (int i = 0; i < 10; i++) {
            if (par[i] != 0)
                System.out.print("[" + par[i] + "] ");
        }
        System.out.println("");
        System.out.print("Array impar: ");
        for (int i = 0; i < 10; i++) {
            if (impar[i] != 0)
                System.out.print("[" + impar[i] + "] ");
        }

    }
}
