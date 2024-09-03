package edu.java.ControleDeFluxo;

public class ExerControleDeFluxo2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int dia = 1;
        
        switch(dia = 4) {
            case 6:
                System.out.println("Fim de semana");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Dia util");
                break;
        }
    }
}
