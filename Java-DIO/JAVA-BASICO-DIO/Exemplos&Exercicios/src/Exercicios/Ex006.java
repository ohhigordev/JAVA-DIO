package Exercicios;
import java.util.Scanner;

public class Ex006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Pedindo o login e senha ao usuário:
        System.out.print("Digite seu usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        // Verificando login e senha:
        if(usuario.equals("higor") && senha.equals("1234")){
            System.out.printf("Usuário %s logado com sucesso.", usuario);
        }  
        
        else{
            System.out.print("Senha ou login incorretos!");
        }        
        sc.close();
    }
    
}
