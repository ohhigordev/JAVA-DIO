package edu.higor.Exercicios.ExerFacil;
import java.util.Scanner;

public class Ex004 {
    // Verficar se um número é par ou impar:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        // Verificando as condições:
        if(num % 2 == 0){
            System.out.println("O número digitado é par!");
        }
        else{
            System.out.println("O número digitado acima é impar!");
        }

        sc.close();
    }
    
}
