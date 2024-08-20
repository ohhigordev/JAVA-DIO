package edu.higor.TerceiraSemana;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};   

        // O atributo 'length' quer dizer tamanho!
        for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno com indice x: " + x + " é " + alunos[x]);
        }

        // Forma abreviada:
        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        
    }
}
