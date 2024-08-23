package edu.higor.Exercicios.ExerFacil;
import java.util.Scanner;;

public class Ex010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitando o número ao usuário
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        // Verificando se o número é primo
        boolean ehPrimo = verificarPrimo(numero);

        // Exibindo o resultado
        if (ehPrimo) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        sc.close();
    }

    // Método para verificar se um número é primo
    public static boolean verificarPrimo(int num) {
        // Números menores que 2 não são primos
        if (num < 2) {
            return false;
        }

        // Verifica divisibilidade de 2 até a raiz quadrada de num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
 
}
