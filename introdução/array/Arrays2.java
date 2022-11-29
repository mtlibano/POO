package br.com.max.introducao.arrays;

public class Arrays2 {
    public static void main(String[] arg){
        String[] nome = new String[4];

        nome[0] = "MAX";
        nome[1] = "NIKI";
        nome[2] = "MARIA";
        nome[3] = "WILL";

        System.out.println("Tamanho total do array: " + nome.length);

        for(int i=0; i<nome.length; i++) {
            System.out.println(nome[i]);
        }
    }
}
