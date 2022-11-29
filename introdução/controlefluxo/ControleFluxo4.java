package br.com.max.introducao.controlefluxo;

public class ControleFluxo4 {
    public static void main(String[] arg){
        int contador = 0;

        /**while (contador < 10){
            contador ++;
            System.out.println(contador);
        }**/

        do {
            System.out.println("Primeira vez no contador" + contador++);
        } while (contador < 10);
            contador ++;
            System.out.println(contador);

        /**for(int i = 1; i<=10; i++){
            System.out.println("Valor de i é: " + i);
        }**/

    }
}
