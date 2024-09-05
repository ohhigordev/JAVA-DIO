package edu.java.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        
        /* === Formas de criar um Array ===  
        int [] numeros = new int[5];
        int [] numeros2 = {1,2,3,4,5}; // tam = 5, index = 0 até 4; 
        int [] numeros3 = new int[]{1,2,3,4,5}; 
        */
        
        int [] numeros2 = {1,2,3,4,5}; // tam = 5, index = 0 até 4; 
        //for (int i = 0; i < numeros2.length; i++){
        //    System.out.println(numeros2[i]);
        //}

        for (int aux : numeros2) {
            System.out.println(aux);
        }
    }
}
