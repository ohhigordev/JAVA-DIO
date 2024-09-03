package edu.java.ControleDeFluxo;

public class ExerControleDeFluxo3 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 100mil
        int contador = 0;

        while (contador < 100000) {
            if (contador % 2 == 0) {
                System.out.println(contador);
                
            }
             contador++;  
        }
    }
}
