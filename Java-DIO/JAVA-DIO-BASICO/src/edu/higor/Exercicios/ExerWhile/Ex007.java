package edu.higor.Exercicios.ExerWhile;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        /* Tabuada: Faça um programa que peça ao usuário para digitar um número e, usando um laço while, exiba a tabuada desse número de 1 a 10. */
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        while(true){

            // Perguntando o número ao usuário:
            System.out.println("Digite um número de 0 a 10:");
            int num = in.nextInt();
            
            if(num == 0 || num <= 10) {
                System.out.println("1 X " + num + " = " + num * 1 );
                System.out.println("2 X " + num + " = " + num * 2 );
                System.out.println("3 X " + num + " = " + num * 3 );
                System.out.println("4 X " + num + " = " + num * 4 );
                System.out.println("5 X " + num + " = " + num * 5 );
                System.out.println("6 X " + num + " = " + num * 6 );
                System.out.println("7 X " + num + " = " + num * 7 );
                System.out.println("8 X " + num + " = " + num * 8 );
                System.out.println("9 X " + num + " = " + num * 9 );
                System.out.println("10 X " + num + " = " + num * 10 );

            }
            else{
                System.out.println("Opção invalida! Tente novamente.");
            }
        } 
    }
}
