package edu.higor.Exercicios.ExerFacil;
import java.util.Scanner;



public class Ex007 {
    // Calculadora simples:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedindo o número ao usuário:
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print('\n');

        static void calculadora(){
        // Definindo as operações:
        System.out.println("Digite um sinal da operção ['+', '-', '*', '/']: ");
        String op = sc.nextLine();

            if(op == "+") {
                int soma = n1 + n2;
                System.out.println("A soma dos números é: " + soma);
            }
            else if(op == "-") {
                int subtracao = n1 - n2;
                System.out.println("A subtração dos números é: " + subtracao);
            }
            else if(op == "*") {
                int multi = n1 * n2;
                System.out.println("A multiplicação dos números é: " + multi);
            }
            else if( op == "/") {
                double div = n1 / n2;
                System.out.println("A divisão dos números é: " + div);
            }
        }

        sc.close();
        
    }
}
