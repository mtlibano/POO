package poo.exe03.main;

import poo.exe03.classe.Equipe;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class Campeonato {
    public static void main(String[] args) {

        ArrayList<Equipe> lista = new ArrayList<Equipe>();
        char cont = 's';

        do {
            String n = JOptionPane.showInputDialog("Digite o nome");
            String c = JOptionPane.showInputDialog("Digite a cidade");
            String nt = JOptionPane.showInputDialog("Digite o nome do técnico");
            int q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pontos"));
            int nv = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vitórias"));
            int sv = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de sets vencidos"));
            int fc = Integer.parseInt(JOptionPane.showInputDialog("Digite a coloção final do campeonato"));
            String em = JOptionPane.showInputDialog("Digite o email da equipe");
            Equipe e = new Equipe(n, c, nt, q, nv, sv, fc, em);
            lista.add(e);
            cont = JOptionPane.showInputDialog("Cadastrar uma nova equipe? S ou N").charAt(0);
        } while (cont == 'S' || cont == 's');

        Collections.sort(lista);

        System.out.println("Equipe vencedora: " + lista.get(0).getNome() + ", cidade:  " + lista.get(0).getCidade() + ", técnico: " + lista.get(0).getNomeTec() + ", total pontos: " + lista.get(0).getQtaPontos() + ", número vitórias: " + lista.get(0).getNumVitorias() + ", sets vencidos: " + lista.get(0).getSetsVencidos() + ", colocação final: " + lista.get(0).getFinalCampeonato() + "°, email: " + lista.get(0).getEmail());

        for (int i = 0; i < 3; i++){
            System.out.println((i + 1) + "° " + lista.get(i).getNome() + " - Cidade: " + lista.get(i).getCidade());
        }

        System.out.println("Total de equipes: " + lista.size());

    }
}