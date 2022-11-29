package poo.array.exe02.classe;

import javax.swing.*;

public class Uniao {
    private int[] arrV1 = new int[7];
    private int[] arrV2 = new int[7];
    private int[] uniao = new int[14];

    public Uniao() {
        this.arrV1 = arrV1;
        this.arrV2 = arrV2;
        this.uniao = uniao;
    }

    public void startUp() {
        System.out.print("v1 = ");
        for (int i = 0; i < this.arrV1.length; i++) {
            arrV1[i] = Integer.parseInt(JOptionPane.showInputDialog("Vetor 1\nDigite o " + (i + 1) + "º valor"));
            System.out.print(arrV1[i] + " ");
        }
        System.out.print("\nv2 = ");
        for (int c = 0; c < this.arrV2.length; c++) {
            arrV2[c] = Integer.parseInt(JOptionPane.showInputDialog("Vetor 2\nDigite o " + (c + 1) + "º valor"));
            System.out.print(arrV2[c] + " ");
        }
    }

    public void uniao() {
        for (int i = 0; i < this.arrV1.length; i++) {
            this.uniao[i] = this.arrV1[i];
        }
        for (int c = 0; c < this.uniao.length; c++) {
            if (this.uniao[c] == 0) {
                this.uniao[c] = this.arrV2[(c - this.arrV2.length)];
            }
        }

        System.out.print("\nUnião = ");
        for (int todos : uniao) {
            System.out.print(todos + " ");
        }
    }
}
