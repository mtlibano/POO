package atvpoo.arrays;

import java.util.Random;

public class exe03 {
    public static void main(String[] args) {

        int[][] num = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < num.length; i++) {
            for (int c = 0; c < num.length; c++) {
                num[i][c] = random.nextInt(10);
                System.out.println("[" + i + "," + c + "] = " + num[i][c]);
            }
        }
    }
}