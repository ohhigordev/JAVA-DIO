package edu.higor.Exercicios.ExerFacil;


public class Ex008 {
    // calculando o fatorial de um número:
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;

        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("O fatorial do número" + num + " é: " + factorial);
    }

}

