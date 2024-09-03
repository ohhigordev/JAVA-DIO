package edu.higor.Exercicios.ExerWhile;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        /*Número par: Faça um programa que leia um número inteiro e utilize um laço while para encontrar o próximo número par maior que o número lido. */
        Scanner in = new Scanner(System.in);

        while(true) {
            // Pedindo o número ao usuario:
            System.out.println("Digite um número: ");
            int num = in.nextInt();

            // Verificando se o número é par:
            if(num % 2 == 0){
                int proxPar = num + 2;
                System.out.println("O prósimo número par depois de " + num + " é " + proxPar);
                break;
            }
            else if (num % 2 != 0){
                int proxPar = num + 1;
                System.out.println("O prósimo número par depois de " + num + " é " + proxPar);
                break;
            }
            else{
                System.out.println("Opção invalida! Tente novamente.");
            }
        }
        in.close();

    }
}
