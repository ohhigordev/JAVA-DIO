package edu.java.Arrays;

public class Arrays6 {
    public static void main(String[] args) {
        // Aqui temos uma arrays de 3 posições que não se referencia a nada:
        int [][] dias = new int [3][];

        // Aqui estamos criando arrays de tamanho personalizado:
        dias [0] = new int[2];
        dias [1] = new int[]{1,2,3};
        dias [2] = new int [4];

        for(int[] arr: dias ){
            for(int num : arr){
                System.out.println(num);
            }
        }
    }
}
