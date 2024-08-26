package edu.higor.javaDIO.DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pedindo os parametros ao usuário:
        System.out.println("Digite o primiro parametro: ");
        int parametroUm = in.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int parametroDois = in.nextInt();
        try{
            // Chamando o método contendo a lógica de contagem:
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException exception){
            System.out.println("Erro: O segundo parametro deve ser maior que o primeiro.");
        }
        in.close();
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException(); 
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número" + i);
        }
    }
}

// Criando a exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
    }
}
