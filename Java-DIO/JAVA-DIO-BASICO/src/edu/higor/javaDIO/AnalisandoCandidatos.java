package edu.higor.javaDIO;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class AnalisandoCandidatos {
    public static void main(String[] args){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
        
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");

        }while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu)
            System.out.println("CONSEGUIMEOS CONTATO COM O CANDIDATO " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM CANDIDATO " + candidato + " NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS.");

        

    }


    // Método auxiliar:
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice dos elementos");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "MONICA", "SARA", "EDUARDO", "NICOLE", "HIGOR", "PAULO", "SILVIO"} ;
        int candidatosSelecionados = 0;
        int canditosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && canditosAtual < candidatos.length) {
            String candidato = candidatos[canditosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase > salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            canditosAtual++;
        }
        
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato( double salarioPretendido) {
        double salarioBase = 2000.0;
        if( salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if( salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

}
