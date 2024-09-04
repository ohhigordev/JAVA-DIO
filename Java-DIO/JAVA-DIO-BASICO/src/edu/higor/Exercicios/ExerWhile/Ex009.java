package edu.higor.Exercicios.ExerWhile;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Inicializando variáveis:
        int somaIdades = 0;
        int quantidadeIdades = 0;

        // Começando o laço While:
        while(true){
            System.out.println("Digite a sua idade (Se for colocado algum número negativo o programa encerrara): ");
            int idade = in.nextInt();

            // Crinado as condições:
            if ( idade < 0){
                break;
            }
            somaIdades += idade; // Soma as idades.
            quantidadeIdades++; // Conta quantas idades foram inseridas.
        }
        if (quantidadeIdades > 0) {
            double media = (double) somaIdades / quantidadeIdades;
            System.out.printf("A média das idades inseridas é: %.2f%n ", media);
        }else{
            System.out.println("Nenhuma idade foi inserida.");
        }
        in.close();
    }
}
