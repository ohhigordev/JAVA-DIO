package edu.higor.Exercicios.java;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        // Dado um valor de um carro descubra quantas vezes ele pode ser parcelado
        // Porém as parcelas não podem ser menor do que mil.

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                 System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            }
            else {
                System.out.println("Saindo do laço");
                break;
            }
           
        }
    }
}
