package edu.java.ControleDeFluxo;
import java.util.Scanner;

public class ExerControleDeFluxo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Perguntando o salário ao usuário:
        System.out.print("Digite o seu salário: R$");
        double salario = in.nextDouble();

        // Calculando o imposto:
        if(salario < 1000) {
            double imposto = (salario * 5) / 100;
            double total = salario - imposto;
            System.out.println("Seu salário liquido é: R$" + total);
        }
        else if (salario >= 1000 && salario < 2000) {
            double imposto = (salario * 10) / 100;
            double total = salario - imposto;
            System.out.println("Seu salário liquido é: R$" + total);
        }
        else if (salario >= 2000 && salario < 4000) {
            double imposto = (salario * 15) / 100;
            double total = salario - imposto;
            System.out.println("Seu salário liquido é: R$" + total);
        }
        else if (salario >= 4000 ) {
            double imposto = (salario * 20) / 100;
            double total = salario - imposto;
            System.out.println("Seu salário liquido é: R$" + total);
        }
        else{
            System.out.println("Valor invalido! Tente novamente.");
        }

        in.close();
    }
}
