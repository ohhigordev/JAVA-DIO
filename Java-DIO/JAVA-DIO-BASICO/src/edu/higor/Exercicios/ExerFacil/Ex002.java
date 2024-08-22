package edu.higor.Exercicios.ExerFacil;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Somar dois números:
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        System.out.println("A soma dos número é: " + soma);

        sc.close();
    }
    
}
