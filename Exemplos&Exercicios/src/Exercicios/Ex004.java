package Exercicios;
import java.util.Scanner;

 // Lendo e imprimindo números:
public class Ex004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1) Pedindo o nome do usuário:
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
        // 2) Pedindo a idade do usuário:
        System.out.println("Digite a sua idade: ");
        int idade = in.nextInt();
        // 3) Pedindo a cidade do usuário:
        System.out.println("Informe a cidade em que você nasceu: ");
        String cidade = in.next();

        System.out.print("Olá. Meu nome é " + nome);
        System.out.print(", tenho " + idade + " anos de idade");
        System.out.print(", sou natural de " + cidade + " e estou aprendendo a programar.");

        in.close();
    }
   
}
