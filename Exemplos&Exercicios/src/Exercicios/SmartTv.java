package Exercicios;
public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        // aumentando +1 no volume!
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        // diminuindo -1 no volume!
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}