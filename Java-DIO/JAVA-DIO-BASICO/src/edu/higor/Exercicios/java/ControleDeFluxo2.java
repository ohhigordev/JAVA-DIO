package edu.higor.Exercicios.java;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;

        // Ultilizando o operador ternario:
        status = idade < 18 ? "Não é adulto" : "É adulto" ;
        System.out.println(status);
    }
}
