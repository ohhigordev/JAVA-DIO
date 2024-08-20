package Exercicios;
import java.util.Scanner;

public class Ex010 {
    // Soma dos números em um intervalo;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pedindo ao usuário o intervalo dos números:
        System.out.print("Informe o inicio do intervalor: ");
        int ini = in.nextInt();

        System.out.print("Informe o fim do intervalo: ");
        int fim = in.nextInt();

        // Criando variaveis:
        int i = ini;
        int soma = ini;

        while( i < fim){
            i ++;
            soma += i; // soma = soma + i;
        }

        System.out.println(soma);
        in.close();
    }
    
}
