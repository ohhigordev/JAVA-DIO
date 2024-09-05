package edu.java.Arrays;

public class Arrays5 {
    public static void main(String[] args) {

        // Vamos começar com arrays bi dimensionais:
        /* RESUMINDO ESSE ARRAY REPRESENTA E ARMAZENA MAIS DOIS ARRAIS */
        int [][] mesesDias = new int[2][2];

        // DETERMINANDO OS VALORES DO 1 ARRAY:
        mesesDias [0] [0] = 30;
        mesesDias [0] [1] = 31;

        //DETERMINANDO OS VALORES DO 2 ARRAY:
        mesesDias [1] [0] = 29;
        mesesDias [1] [1] = 28;

        // Imprimindo os arrays:
        for(int i = 0; i < mesesDias.length; i++){
            System.out.println(mesesDias[i]);
            for(int j = 0; j < mesesDias[i].length; j++){
                System.out.println(mesesDias [i] [j]);
            }
        }
        System.err.println("=====================");
        for(int [] ref : mesesDias){
            for(int mesesDia : ref){
                System.out.println(mesesDia);
            }
        }
    }
}
