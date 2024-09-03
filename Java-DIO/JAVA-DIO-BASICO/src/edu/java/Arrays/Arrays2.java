package edu.java.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // byte, short, long, int, float, double = 0
        // char '\u0000' ' '
        // boolena = false
        // reference null

        String [] nomes = new String[4]; // Se você não denominar os espaços eles seram definidos como valor zero.
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Gohan";
        nomes[3] = "Frezza";

        // Imprimindo os nomes usando o for:
        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        
    }
}
