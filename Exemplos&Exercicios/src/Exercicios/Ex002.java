package Exercicios;



public class Ex002 {
    /* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */

    public static void main(String[] args) {
        // dados inseriodos pelo usuário:
        int anos = 3;
        int meses = 7;
        int dias = 20;

        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Total de dias: " + totalDias);


    }
    
}
