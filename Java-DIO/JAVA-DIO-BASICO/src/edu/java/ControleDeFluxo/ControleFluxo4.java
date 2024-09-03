package edu.java.ControleDeFluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        // While precisa de um valor booleano.
        // O while so acontece enquanto ele for verdade.

        int contador = 11;

        while(contador < 10){
            System.out.println(contador);
            contador ++; // Incrementa mais uma unidade no contador!
        }
        contador = 0;
        do{
            System.out.println("Dentro do do-while: " + contador++);
        }while(contador < 10);

        for(int i = 0; i < 10; i++){
            System.out.println("O valor de i é: " + i);
            if (i == 5) {
                break;
            }
        }
    }
}
