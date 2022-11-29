package poo.exe04.main;

import poo.exe04.classe.Pessoa;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Executadora {
    public static void main(String[] args) {
        Pessoa obj = new Pessoa();

        int qta = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas serão cadastradas?"));

        for (int i = 0; i < qta; i++) {
            obj.setNome(JOptionPane.showInputDialog("Digite o nome"));
            obj.setAnoNasc(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento")));
            obj.setSexo(JOptionPane.showInputDialog("Digite o sexo (M ou F)").charAt(0));
            obj.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário")));
            obj.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso (kg)")));
            obj.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (metros)")));

            System.out.println("Cadastrado realizado com sucesso!");

            System.out.println(obj.toString());
            System.out.println("Idade: " + obj.calcIdade());
            System.out.println("IMC: " + new DecimalFormat("#,##0.00").format(obj.calcImc()));

            System.out.println("Número total de cadastros: " + (i + 1));
            obj.calcNum();
            obj.calcAcum();
            System.out.println("Média salários: " + obj.calcMedia());
            System.out.println("========================");

        }
    }
}