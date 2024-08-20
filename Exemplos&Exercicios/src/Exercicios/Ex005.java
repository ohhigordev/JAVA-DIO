package Exercicios;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedindo os dados ao usuário:
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite a idade da sua mãe: ");
        int idadeMae = sc.nextInt();

        // Calculando a diferença de idade:
        int diferençaIdade = idadeMae - idade;
        System.out.println("Sua mãe é " + diferençaIdade + " anos mais velha do que você."); 

        sc.close();
    }
    
}
