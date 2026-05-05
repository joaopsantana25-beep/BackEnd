/*
Exercicio 022
Faça um Programa que verifique se uma letra digitada é vogal ou consoante
 */

import java.util.Scanner;


public class Exercicio22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char[] vogais = {'a','e','i','o','u'};
        boolean encontrada = false;

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        for (char v : vogais){
            if (v == letra){
                encontrada=true;
                break;
                }
        }

        if (encontrada){
            System.out.print("Você digitou uma vogal");
        }
        else{
            System.out.print("Você digitou uma consoante");
        }
    }
}
