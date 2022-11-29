package br.com.max.introducao.controlefluxo;

public class ExeControleFluxo {
    public static void main(String[] arg){
        float salario = 2000;
        int imposto = 100;


        if (salario < 1000) {
            salario *= 0.95;
            System.out.println(salario);
        } else if (salario < 2000) {
            salario *= 0.9;
            System.out.println(salario);
        } else if (salario < 4000) {
            salario *= 0.85;
            System.out.println(salario);
        } else if (salario > 5000) {
            salario *= 0.8;
            System.out.println(salario);
        }

        String teste = imposto < 90 ? "Imposto baixo" : "Imposto alto";
        System.out.println(teste);
    }
}
