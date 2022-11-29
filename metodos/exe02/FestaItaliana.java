package poo.exe02.main;

import poo.exe02.classe.Visitantes;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class FestaItaliana {
    public static void main(String[] args) {

        ArrayList<Visitantes> lista = new ArrayList<Visitantes>();
        char cont = 's';
        int contadorMasc = 0;
        int contadorFem = 0;
        int contadorAno = 0;

        do {
            String n = JOptionPane.showInputDialog("Digite o nome");
            String f = JOptionPane.showInputDialog("Digite o telefone");
            String c = JOptionPane.showInputDialog("Digite a cidade");
            char s = JOptionPane.showInputDialog("Digite o sexo (M ou F)").charAt(0);
            if (s == 'M' || s == 'm') {
                contadorMasc++;
            } else if (s == 'F' || s == 'f') {
                contadorFem++;
            }
            String p = JOptionPane.showInputDialog("Digite a profissao");
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
            if ((2022 - a) < 18)
                contadorAno++;
            Visitantes v = new Visitantes(n, f, c, s, p, a);
            lista.add(v);
            cont = JOptionPane.showInputDialog("Cadastrar nova pessoa? S ou N").charAt(0);
        } while(cont == 'S' || cont == 's');

        System.out.println("Quantidade de pessoas no evento: " + lista.toArray().length);
        System.out.println("Público masculino: " + contadorMasc);
        System.out.println("Público feminino: " + contadorFem);
        System.out.println("Percentual de homens: " + ((contadorMasc * 100) / (contadorMasc + contadorFem)) + "%");
        System.out.println("Percentual de mulheres: " + ((contadorFem * 100) / (contadorMasc + contadorFem)) + "%");
        System.out.println("Público menor de 18 anos: " + contadorAno);

    }
}