package edu.higor.Exercicios.ExerWhile;
import java.util.Random;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        /* Adivinhação: Escreva um programa de adivinhação onde o usuário deve adivinhar um número entre 1 e 100. O programa deve continuar pedindo palpites até que o usuário adivinhe corretamente.*/

        // Criando o objeto random e scanner:
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        // Gerando números aleatorios:
        int randomInt = random.nextInt(100); // Gera um número de 0 a 99.

        // Iniciando o loop While:
        while (true){

         // Pedindo um número ao usuario:
            System.out.println("Digite um número: ");
            int num = in.nextInt();

            if(num == randomInt) {
                System.out.println("Parabéns você acertou!");
                break;
            }
            else{
                System.out.println("Tente novamente!");
            }
            
        }
        in.close();
    }
    
}
