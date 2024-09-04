package edu.higor.Exercicios.ExerWhile;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        /* Soma dos dígitos: Crie um programa que peça ao usuário para inserir um número inteiro positivo e, utilizando um laço while, calcule a soma dos dígitos desse número. */

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = in.nextInt();

        int soma = 0;

        // Verifica se o número é positivo
        if (numero > 0) {
            while (numero > 0) {
                int digito = numero % 10; // Obtém o último dígito do número
                soma += digito; // Adiciona o dígito à soma
                numero /= 10; // Remove o último dígito do número
            }

            System.out.println("A soma dos dígitos é: " + soma);
        } else {
            System.out.println("O número digitado não é positivo.");
        }
        in.close();
    }
}
