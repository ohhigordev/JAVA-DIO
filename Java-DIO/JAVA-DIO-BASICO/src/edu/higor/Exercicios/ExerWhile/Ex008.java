package edu.higor.Exercicios.ExerWhile;
import java.util.Scanner;
public class Ex008 {
    public static void main(String[] args) {
        /* Cálculo de fatorial: Crie um programa que calcule o fatorial de um número fornecido pelo usuário utilizando um laço while. */

        while (true) {
            Scanner in = new Scanner(System.in);

            // Pedindo o número ao usuário:
            System.out.println("Digite um número: ");
            int num = in.nextInt();
            int factorial = 1;
            
            for(int i = 1; i <= num; i++) {
                factorial *= i;
            }
            // Imprimindo o fatorial do número:
            System.out.println("O fatorial do número " + num + " é " + factorial);
        }
    }
}
