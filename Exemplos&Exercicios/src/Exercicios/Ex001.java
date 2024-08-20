package Exercicios;
import java.util.Scanner;

public class Ex001 {
    // Pergunte ao usuário números de 0 a 10 e se o número digitado for maior que 10 encerre o programa.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo um número ao usuário:
        System.out.print("Insira um número de 0 a 10: ");
        int numero = scanner.nextInt();

        if(numero <= 10)
            System.out.println("O número digitado foi: " + numero);
        
        else
            System.out.println("O número digitado é maior que 10, tente novamente!");
            
        scanner.close();
    }
    
}
