package Exercicios;
import java.util.Scanner;

// Simplificando códigos:
public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simplifincando a expressão para reduzir o número de linhas: ");
        int x = sc.nextInt();
        String s = (x > 10) ? "maior":"menor";
        System.out.printf("O número digitado é %s que 10.", s);
        
        sc.close();
    }
    
}
