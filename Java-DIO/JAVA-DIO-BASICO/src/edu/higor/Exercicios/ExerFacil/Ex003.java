package edu.higor.Exercicios.ExerFacil;
import java.util.Scanner;

public class Ex003 {
    // Calcule a media de 3 números:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedindo os números ao usuário:
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        // Calculando a media:
        double media = (n1 + n2 + n3) / 3;
        System.out.println("A média dos números digitados foi: " + media);

        sc.close();
        
    }
}
