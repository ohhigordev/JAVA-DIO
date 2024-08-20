package Exercicios;
import java.util.Scanner;


public class Ex008 {
    // Tabuada ao avesso:
    public static void main(String[] args) {
        // Pedindo para usuário informar a tabuada:
        System.out.println("Digite a tabuada que você deseja: ");

        // Criamos uma instancia de scanner:
        Scanner in = new Scanner(System.in);
        int tabuada = in.nextInt(); // Pegamos o valor digitado pelo usuário:

        for(int i = 10; i >= 1; i--){
            // Ax * Bx = Cx
            //Ax == valor informado pelo usuário.
            //Bx == valor a ser decrementado.
            //Cx == cálculo.
          System.out.println(tabuada + " x " + i + " = " + (tabuada * i));  
        }
        in.close();
    }
}
