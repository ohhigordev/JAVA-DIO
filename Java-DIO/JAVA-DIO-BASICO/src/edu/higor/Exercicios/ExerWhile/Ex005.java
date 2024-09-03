package edu.higor.Exercicios.ExerWhile;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        /*Senha correta: Crie um programa que peça ao usuário para digitar uma senha. O programa deve continuar pedindo a senha até que o usuário insira a senha correta. */

        Scanner in = new Scanner(System.in);

        final int SENHA = 1234; // Definindo senha padrão.

        while(true) {
            System.out.println("Digite sua senha: ");
            int senha = in.nextInt();

            if (senha == SENHA) {
                System.out.println("Senha correta! Usuario logado!");
                break;
            }
            else{
                System.out.println("Senha incorreta! Tente novamente.");
            }
        }
        in.close();
    }
}
