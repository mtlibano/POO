package poo.exe01.classe;

import javax.swing.JOptionPane;

public class Elevador {

    private int andar;
    private int totalAndar;
    private int capElevador;
    private int qtaPessoas;

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getAndar() {
        return this.andar;
    }

    public void setTotalAndar(int totalAndar) {
        this.totalAndar = totalAndar;
    }

    public int getTotalAndar() {
        return this.totalAndar;
    }

    public void setCapElevador(int capElevador) {
        this.capElevador = capElevador;
    }

    public int getCapElevador() {
        return this.capElevador;
    }

    public void setQtaPessoas(int qtaPessoas) {
        this.qtaPessoas = qtaPessoas;
    }

    public int getQtaPessoas() {
        return this.qtaPessoas;
    }

    public void inicializa() {
        this.totalAndar = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de andares"));
        this.capElevador = Integer.parseInt((JOptionPane.showInputDialog("Capacidadee máxima do elevador")));
        this.andar = 0;
        this.qtaPessoas = 0;
    }

    public void entra() {
        if (this.qtaPessoas < this.capElevador) {
            this.qtaPessoas++;
            System.out.println("Entrou 1 pessoa. Total no elevador: " + this.qtaPessoas);
        } else {
            System.out.println("Elevador cheio! Impossível entrar outra pessoa!");
        }
    }

    public void sai() {
        if (this.qtaPessoas > 0) {
            this.qtaPessoas--;
            System.out.println("Saiu 1 pessoa. Total no elevador: " + this.qtaPessoas);
        } else {
            System.out.println("Elevador vazio! Impossível sair alguém!");
        }
    }

    public void sobe() {
        if (this.andar < this.totalAndar) {
            this.andar++;
            System.out.println("Subiu um andar. Andar atual: " + this.andar);
        } else {
            System.out.println("Impossível subir mais!");
        }
    }

    public void desce() {
        if (this.andar > 0) {
            this.andar--;
            System.out.println("Desceu um andar. Andar atual: " + this.andar);
        } else {
            System.out.println("Impossível descer mais!");
        }
    }

    public void status() {
        System.out.println("Quantidade de andares: " + this.totalAndar);
        System.out.println("Capacidade elevador: " + this.capElevador);
        System.out.println("Andar atual: " + this.andar);
        System.out.println("Total de pessoas: " + this.qtaPessoas);
    }
}