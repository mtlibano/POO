package poo.array.exe01.classe;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Random;

public class Array {

    private int[] a = new int[15];
    private int[] b = new int[15];
    private int[] c = new int[15];
    private int[] d = new int[15];

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int[] getB() {
        return b;
    }

    public void setB(int[] b) {
        this.b = b;
    }

    public int[] getC() {
        return c;
    }

    public void setC(int[] c) {
        this.c = c;
    }

    public int[] getD() {
        return d;
    }

    public void setD(int[] d) {
        this.d = d;
    }

    public void inicializa() {
        Random random = new Random();
        System.out.print("A = ");
        for (int i = 0; i < this.a.length; i++) {
            this.a[i] = random.nextInt(1, 20);
            System.out.print(this.a[i] + " ");
        }
        System.out.print("\nB = ");
        for (int i = 0; i < this.b.length; i++) {
            this.b[i] = random.nextInt(1, 20);
            System.out.print(this.b[i] + " ");
        }
        System.out.println("");
    }

    public void totalPares() {
        int i = 0;
        String opt = JOptionPane.showInputDialog("Selecione o vetor\nA\nB\nC\nD");
        if (opt.equals("a")) {
            System.out.print("Número par: ");
            for (int cont : this.a) {
                if (cont % 2 == 0 && cont != 0) {
                    i++;
                    System.out.print(cont + " ");
                }
            }
            System.out.println("\nTotal de valores par vetor A: " + i);
        }
        if (opt.equals("b")) {
            System.out.print("Número par: ");
            for (int cont : this.b) {
                if (cont % 2 == 0 && cont != 0) {
                    i++;
                    System.out.print(cont + " ");
                }
            }
            System.out.println("\nTotal de valores par vetor B: " + i);
        }
        if (opt.equals("c")) {
            System.out.print("Número par: ");
            for (int cont : this.c) {
                if (cont % 2 == 0 && cont != 0) {
                    i++;
                    System.out.print(cont + " ");
                }
            }
            System.out.println("\nTotal de valores par vetor C: " + i);
        }
        if (opt.equals("d")) {
            System.out.print("Número par: ");
            for (int cont : this.d) {
                if (cont % 2 == 0 && cont != 0) {
                    i++;
                    System.out.print(cont + " ");
                }
            }
            System.out.println("\nTotal de valores par vetor D: " + i);
        }
    }

    public void maiorValor() {
        int maior = 0;
        String opt = JOptionPane.showInputDialog("Selecione o vetor\nA\nB\nC\nD");
        if (opt.equals("a")) {
            for (int i = 0; i < this.a.length; i++) {
                if (i == 0)
                    maior = this.a[i];
                else if (maior < this.a[i])
                    maior = this.a[i];
            }
            System.out.println("Maior valor vetor A: " + maior);
        }
        if (opt.equals("b")) {
            for (int i = 0; i < this.b.length; i++) {
                if (i == 0)
                    maior = this.b[i];
                else if (maior < this.b[i])
                    maior = this.b[i];
            }
            System.out.println("Maior valor vetor B: " + maior);
        }
        if (opt.equals("c")) {
            for (int i = 0; i < this.c.length; i++) {
                if (i == 0)
                    maior = this.c[i];
                else if (maior < this.c[i])
                    maior = this.c[i];
            }
            System.out.println("Maior valor vetor C: " + maior);
        }
        if (opt.equals("d")) {
            for (int i = 0; i < this.d.length; i++) {
                if (i == 0)
                    maior = this.d[i];
                else if (maior < this.d[i])
                    maior = this.d[i];
            }
            System.out.println("Maior valor vetor D: " + maior);
        }
    }

    public void totalIguais() {
        int cont = 0;
        String opt1 = JOptionPane.showInputDialog("Selecione o 1º vetor\nA\nB\nC\nD");
        String opt2 = JOptionPane.showInputDialog("Selecione o 2ª vetor\nA\nB\nC\nD");
        if ((opt1.equals("a") && opt2.equals("b")) || (opt1.equals("b") && opt2.equals("a"))) {
            System.out.print("Valores iguais: ");
            for (int i = 0; i < this.a.length; i++) {
                for (int h = 0; h < this.b.length; h++) {
                    if (this.a[i] == this.b[h]) {
                        System.out.print(this.a[i] + " ");
                        cont++;
                    }
                }
            }
            System.out.println("\nTotal de valores iguais nos arrays A e B: " + cont);
        }
        if ((opt1.equals("a") && opt2.equals("c")) || (opt1.equals("c") && opt2.equals("a"))) {
            System.out.print("Valores iguais: ");
            for (int i = 0; i < this.a.length; i++) {
                for (int h = 0; h < this.c.length; h++) {
                    if (this.a[i] == this.c[h]) {
                        System.out.print(this.a[i] + " ");
                        cont++;
                    }
                }
            }
            System.out.println("\nTotal de valores iguais nos arrays A e C: " + cont);
        }
        if ((opt1.equals("a") && opt2.equals("d")) || (opt1.equals("d") && opt2.equals("a"))) {
            System.out.print("Valores iguais: ");
            for (int i = 0; i < this.a.length; i++) {
                for (int h = 0; h < this.d.length; h++) {
                    if (this.a[i] == this.d[h]) {
                        System.out.print(this.a[i] + " ");
                        cont++;
                    }
                }
            }
            System.out.println("\nTotal de valores iguais nos arrays A e D: " + cont);
        }
        if ((opt1.equals("b") && opt2.equals("c")) || (opt1.equals("c") && opt2.equals("b"))) {
            System.out.print("Valores iguais: ");
            for (int i = 0; i < this.b.length; i++) {
                for (int h = 0; h < this.c.length; h++) {
                    if (this.b[i] == this.c[h]) {
                        System.out.print(this.b[i] + " ");
                        cont++;
                    }
                }
            }
            System.out.println("\nTotal de valores iguais nos arrays B e C: " + cont);
        }
        if ((opt1.equals("b") && opt2.equals("d")) || (opt1.equals("d") && opt2.equals("b"))) {
            System.out.print("Valores iguais: ");
            for (int i = 0; i < this.b.length; i++) {
                for (int h = 0; h < this.d.length; h++) {
                    if (this.b[i] == this.d[h]) {
                        System.out.print(this.b[i] + " ");
                        cont++;
                    }
                }
            }
            System.out.println("\nTotal de valores iguais nos arrays B e D: " + cont);
        }
        if ((opt1.equals("c") && opt2.equals("d")) || (opt1.equals("d") && opt2.equals("c"))) {
            System.out.print("Valores iguais: ");
            for (int i = 0; i < this.c.length; i++) {
                for (int h = 0; h < this.d.length; h++) {
                    if (this.c[i] == this.d[h]) {
                        System.out.print(this.c[i] + " ");
                        cont++;
                    }
                }
            }
            System.out.println("\nTotal de valores iguais nos arrays C e D: " + cont);
        }
    }

    public void multiplicaArrays() {
        String op = JOptionPane.showInputDialog("Array de saída\nC\nD");
        if (op.equals("c")) {
            System.out.print("C = ");
            for (int i = 0; i < c.length; i++) {
                this.c[i] = this.a[i] * this.b[i];
                System.out.print(this.c[i] + " ");
            }
            System.out.println("");
        }
        if (op.equals("d")) {
            System.out.print("D = ");
            for (int i = 0; i < d.length; i++) {
                this.d[i] = this.a[i] * this.b[i];
                System.out.print(this.d[i] + " ");
            }
            System.out.println("");
        }
    }

    public void somaArrays() {
        String op = JOptionPane.showInputDialog("Array de saída\nC\nD");
        if (op.equals("c")) {
            System.out.print("C = ");
            for (int i = 0; i < c.length; i++) {
                this.c[i] = this.a[i] + this.b[i];
                System.out.print(this.c[i] + " ");
            }
            System.out.println("");
        }
        if (op.equals("d")) {
            System.out.print("D = ");
            for (int i = 0; i < d.length; i++) {
                this.d[i] = this.a[i] + this.b[i];
                System.out.print(this.d[i] + " ");
            }
            System.out.println("");
        }
    }

    public void mostraDados() {
        String opt = JOptionPane.showInputDialog("Selecione o vetor\nA\nB\nC\nD");
        if (opt.equals("a")) {
            System.out.print("A = ");
            for (int todos : this.a) {
                System.out.print(todos + " ");
            }
            System.out.println("");
        } else if (opt.equals("b")) {
            System.out.print("B = ");
            for (int todos : this.b) {
                System.out.print(todos + " ");
            }
            System.out.println("");
        } else if (opt.equals("c")) {
            System.out.print("C = ");
            for (int todos : this.c) {
                System.out.print(todos + " ");
            }
            System.out.println("");
        } else if (opt.equals("d")) {
            System.out.print("D = ");
            for (int todos : this.d) {
                System.out.print(todos + " ");
            }
            System.out.println("");
        }
    }

    public void mediaArrays() {
        DecimalFormat df = new DecimalFormat("####0.00");
        double total = 0;
        String opt = JOptionPane.showInputDialog("Selecione o vetor\nA\nB\nC\nD");
        if (opt.equals("a")) {
            for (int cont : this.a) {
                total += cont;
            }
            System.out.println("Média array A: " + df.format(total / a.length));
        }
        if (opt.equals("b")) {
            for (int cont : this.b) {
                total += cont;
            }
            System.out.println("Média array B: " + df.format(total / b.length));
        }
        if (opt.equals("c")) {
            for (int cont : this.c) {
                total += cont;
            }
            System.out.println("Média array C: " + df.format(total / c.length));
        }
        if (opt.equals("d")) {
            for (int cont : this.d) {
                total += cont;
            }
            System.out.println("Média array D: " + df.format(total / d.length));
        }
    }

    public void buscaArrays() {
        boolean test = false;
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        String opt = JOptionPane.showInputDialog("Selecione o vetor\nA\nB\nC\nD");
        if (opt.equals("a")) {
            for (int i = 0; i < a.length; i++) {
                if (valor == a[i]) {
                    System.out.print("Valor " + a[i] + " encontrado na posição " + i + " do vetor A\n");
                    test = true;
                }
            }
            if (!test)
                System.out.println("Valor " + valor + " não encontrado no array A");
        }
        if (opt.equals("b")) {
            for (int i = 0; i < b.length; i++) {
                if (valor == b[i]) {
                    System.out.print("Valor " + b[i] + " encontrado na posição " + i + " do vetor B\n");
                    test = true;
                }
            }
            if (!test)
                System.out.println("Valor " + valor + " não encontrado no array B");
        }
        if (opt.equals("c")) {
            for (int i = 0; i < c.length; i++) {
                if (valor == c[i]) {
                    System.out.print("Valor " + c[i] + " encontrado na posição " + i + " do vetor C\n");
                    test = true;
                }
            }
            if (!test)
                System.out.println("Valor " + valor + " não encontrado no array C");
        }
        if (opt.equals("d")) {
            for (int i = 0; i < d.length; i++) {
                if (valor == d[i]) {
                    System.out.print("Valor " + d[i] + " encontrado na posição " + i + " do vetor D\n");
                    test = true;
                }
            }
            if (!test)
                System.out.println("Valor " + valor + " não encontrado no array D");
        }
    }

    public void buscaTodos() {
        boolean test = false;
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        for (int i = 0; i < a.length; i++) {
            if (valor == a[i]) {
                System.out.println("Valor " + valor + " encontrado no vetor A, posição " + i);
                test = true;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (valor == b[i]) {
                System.out.println("Valor " + valor + " encontrado no vetor B, posição " + i);
                test = true;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (valor == c[i]) {
                System.out.println("Valor " + valor + " encontrado no vetor C, posição " + i);
                test = true;
            }
        }
        for (int i = 0; i < d.length; i++) {
            if (valor == d[i]) {
                System.out.println("Valor " + valor + " encontrado no vetor D, posição " + i);
                test = true;
            }
        }
        if (!test)
            System.out.println("Valor " + valor + " não encontrado");
    }

    public void options() {
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Pares\n2 - Maior Valor\n3 - Valores Iguais\n4 - Multiplica Arrays\n5 - Adição Arrays\n6 - Mostra Dados\n7 - Média Arrays\n8 - Busca Valor Array\n9 - Busca Valor em Todos"));
            if (op == 1)
                this.totalPares();
            if (op == 2)
                this.maiorValor();
            if (op == 3)
                this.totalIguais();
            if (op == 4)
                this.multiplicaArrays();
            if (op == 5)
                this.somaArrays();
            if (op == 6)
                this.mostraDados();
            if (op == 7)
                this.mediaArrays();
            if (op == 8)
                this.buscaArrays();
            if (op == 9)
                this.buscaTodos();
        } while (op != 10);
    }
}