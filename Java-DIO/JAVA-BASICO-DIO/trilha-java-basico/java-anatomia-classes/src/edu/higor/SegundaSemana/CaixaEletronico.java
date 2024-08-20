package edu.higor.SegundaSemana;

public class CaixaEletronico {

    public static void main(String[] args) {
        
        // Denominando variaveis:
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        // Definindo uma condição que precisa ser verdaderia:
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        }
        else
        System.out.println("Saldo insuficiente!");

        

        // Esse foi o exemplo de um controle de fluxo simples!
    }
    
}
