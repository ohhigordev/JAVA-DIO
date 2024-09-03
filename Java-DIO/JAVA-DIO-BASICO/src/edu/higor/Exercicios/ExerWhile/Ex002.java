package edu.higor.Exercicios.ExerWhile;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        /*Soma dos números: Crie um programa que peça ao usuário para inserir números inteiros. O programa deve somar esses números e parar quando o usuário inserir o número 0.*/

        Scanner in = new Scanner(System.in);

        // Pedindo os números ao usuário:
        System.out.print("Digite o primeiro número: ");
        int num1 = in.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = in.nextInt();

        while(true) {
            if (num1 != 0 && num2 !=0) {
                int soma = num1 + num2;
                System.out.println("A soma dos números é: " + soma);
                break;
            }
            else if (num1 == 0 || num2 == 0) {
                System.out.println("Programa encerrado!");
                break;
            }
            else {
                System.out.println("Opção invalida.");
            }
        }

        in.close();
    }
}
