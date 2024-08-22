package edu.higor.Exercicios.ExerFacil;
import java.util.Scanner;


public class Ex006 {
    // Verificando se um número é positivo ou negativo:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        // Verificando o número:
        if (num > 0) {
            System.out.println("O número digitado é positivo!");
        }
        else if(num < 0) {
            System.out.println("O número digitado é negativo!");
        }

        else{
            System.out.println("O número digitado é nulo!");
        }

        sc.close();
    }
    
}
