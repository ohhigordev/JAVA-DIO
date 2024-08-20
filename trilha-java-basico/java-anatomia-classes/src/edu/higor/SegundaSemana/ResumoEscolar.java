package edu.higor.SegundaSemana;

public class ResumoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        // O 'if' sempre será a primeira opção:
        if(nota >= 7)
            System.out.println("Aprovado");
        
        // As condicionais encandeadas no meio dos dois:
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        
        // O 'Else' sempre a última opção:
        else
            System.out.println("Reprovado");
    }
    
}
