package br.com.max.introducao.controlefluxo;

public class ControleFluxo {
    public static void main(String[] arg) {
        int idade = 19;
        float salario = 2000;

        if (idade < 15) {
            System.out.println("Entrou no Infantil");
        } else if (idade < 19) {
            System.out.println("Juvenil");
        } else if (idade > 18) {
            System.out.println("Adulto");
        }
    }
}
