package Exercicios;
public class usuario {
    public static void main(String[] args) throws Exception {
        
        // Java POO = essa é uma forma de orientar a ilustração dos metodos e atributos!
        SmartTv smartTv = new SmartTv();

        // Ajustando o volume:
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal Atual : " + smartTv.canal);

        System.out.println("Volume atual: " + smartTv.volume);

        // Configurações da televisão:
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status : Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status : Tv ligada? " + smartTv.ligada);

    }
}
