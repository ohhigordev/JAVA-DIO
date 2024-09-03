package edu.java.ControleDeFluxo;

public class ControleDeFluxo {
    public static void main(String[] args) {
        // idade < 15 => categoria infantil
        // idade >= 15 && idade < 18 -> categoria juvenil
        // idade >= 18 adulto 
        int idade = 15;
        
        if(idade < 15) {    // Dentro do parentese colocamos a condição!
            System.out.println("Categoria infantil");
        }
        else if(idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil");
        }
        else {
            System.out.println("Categoria adulto");
        } 
    }
}
