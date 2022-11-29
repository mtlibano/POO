package br.com.max.introducao.controlefluxo;

public class ControleFluxo2 {
    public static void main(String[] arg){
        int idade = 15;
        String status;
        boolean ok = true;
        String teste;

        status = idade < 18 ? "Jovem" : "Adulto";

        teste = (ok = false) ? "Verde" : "Fals";

        System.out.println(status);
        System.out.println(teste);
    }
}
