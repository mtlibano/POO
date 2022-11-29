package atvpoo.arrays;

import javax.swing.JOptionPane;

public class exe06 {
    public static void main(String[] args) {
        String[] vaga = new String[10];
        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Entrada\n2 - Saída\n3 - Listar\n4 - Encerrar"));
            if (op == 1) {
                for (int i = 0; i < vaga.length; i++) {
                    if (vaga[i] == null) {
                        vaga[i] = JOptionPane.showInputDialog("Digite a placa"); break;
                    }
                    if (vaga[(vaga.length - 1)] != null) {
                        System.out.println("Não há vaga!"); break;
                    }
                }
            }
            if (op == 2) {
                int i = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da vaga (1 a 10)"));
                vaga[(i - 1)] = null;
            }
            if (op == 3) {
                for (int i = 0; i < vaga.length; i++) {
                    System.out.print("Vaga " + (i + 1) + ": ");
                    if (vaga[i] != null) {
                        System.out.print(vaga[i] + "\n");
                    } else if (vaga[i] == null) {
                        System.out.print("\n");
                    }
                }
            }
        } while (op != 4);
    }
}