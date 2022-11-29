package br.com.max.introducao.controlefluxo;

public class ControleFluxo5 {
    public static void main(String[] arg){

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Número de parcelas: " + parcela + ", valor de cada parcela: R$" + valorParcela);
            }
        }
    }
}
