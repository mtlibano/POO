package atvpoo.arrays;

import java.util.Random;

public class exe02 {
    public static void main(String[] args) {
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        Random random = new Random();
        int i = random.nextInt(11);

        System.out.println("Número randômico: " + i);
        System.out.println("Mês: " + mes[i]);
    }
}
