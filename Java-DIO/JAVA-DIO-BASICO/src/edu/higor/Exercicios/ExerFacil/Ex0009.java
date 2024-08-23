package edu.higor.Exercicios.ExerFacil;
import java.util.Scanner;;

public class Ex0009 {
    public static void main(String[] args) {
        // Como inverter uma String:
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um frase: ");
        String frase = in.nextLine();


        // Usando o método StringBuilder:
        StringBuilder sb = new StringBuilder(frase);
        String invertida = sb.reverse().toString();

        System.out.println("String invertida: " + invertida);

        in.close();
    }
}
