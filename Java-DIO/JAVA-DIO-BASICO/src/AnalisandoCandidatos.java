import java.util.concurrent.ThreadLocalRandom;


public class AnalisandoCandidatos {
    public static void main(String[] args) {
        selecaoCandidatos();
        
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
