/*
Exercicio 047
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e voltando a pedir as informações.

 */

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("\nDigite o nome de usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("\nDigite a sua senha: ");
            String senha = scanner.nextLine();


            if (senha.equals(usuario)){
                System.out.println("A senha não pode ser igual ao nome do usuário!!!");
                System.out.println("Digite outros dados!");
            }

            else{
                System.out.println("Senha e usuário válidos. Tenha um bom Dia!");
                System.out.println("Fim do Programa!");
                break;
            }

        }
        scanner.close();
    }
}
