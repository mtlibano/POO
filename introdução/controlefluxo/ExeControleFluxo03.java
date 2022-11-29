package br.com.max.introducao.controlefluxo;

import javax.swing.JOptionPane;

public class ExeControleFluxo03 {
    public static void main(String[] arg){

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número!"));

        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana!");break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana!");break;
            default:
                System.out.println("Opção invalida!");
        }
    }
}
