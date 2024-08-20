package edu.higor.PrimeiraSemana;
import java.util.Scanner;


public class SomarInteiros {
    // Como somar em Java

    public static void  main(String[] args) {
        // Aqui somamos dois números dados pelo usuário.

        Scanner scanner = new Scanner(System.in);

        // Pedindo para o usuário inserir o primeiro número:
        System.out.print("Insira o primeiro número: ");
        int numero1 = scanner.nextInt();

        // Pedindo para o usúario inserir o segundo número:
        System.out.print("insira o segundo número: ");
        int numero2 = scanner.nextInt();

        // Calculando a soma dos dois números:
        int soma = numero1 + numero2;

        // Exibindo o resultado:
        System.out.println("A soma é: " + soma);

        // Fechando o scanner:
        scanner.close();
    }


}


    

