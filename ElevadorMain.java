package poo.exe01.main;

import poo.exe01.classe.Elevador;

public class ElevadorMain {
    public static void main(String[] args) {

        Elevador e1 = new Elevador();

        e1.inicializa();

        e1.entra();
        e1.entra();
        e1.entra();
        e1.entra();
        e1.sai();

        e1.sobe();
        e1.sobe();
        e1.sobe();
        e1.desce();
        e1.desce();
        e1.desce();
        e1.desce();
        e1.desce();
        e1.desce();

        e1.status();

    }
}
