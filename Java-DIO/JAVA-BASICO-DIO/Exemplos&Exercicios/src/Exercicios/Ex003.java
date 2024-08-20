package Exercicios;

public class Ex003 {
    public static void main(String[] args) {
        // Primeiros 3 números:
        int a1 = 7;
        int a2 = 8;
        int a3 = 9;

        // Outros 3 números:
        int b1 = 4;
        int b2 = 5;
        int b3 = 6;

        // Calculando as medias:
        double media1 = (a1 + a2 + a3) / 3;
        double media2 = (b1 + b2 + b3) / 3;
        double somaMedias = media1 + media2;
        double mediaMedia = (media1 + media2) / 2;

        // Imprimindo os resultados:
        System.out.println("Média 01: " + media1);
        System.out.println("Média 02: " + media2);
        System.out.println("A soma das médias: " + somaMedias);
        System.out.println("A media das médias: " + mediaMedia);
    }
    
}
