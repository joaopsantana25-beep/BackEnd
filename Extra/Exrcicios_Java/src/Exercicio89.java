/*

Exercicio 089

Faça um programa que peça um numero inteiro positivo e em
seguida mostre este numero invertido. Exemplo: 12376489 => 98467321

 */

import java.util.Scanner;


public class Exercicio89 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        String numero = scanner.nextLine();

        int tamanho_numero = numero.length();

        System.out.print(numero+"=>");

        for (int i=0;i<numero.length();i++){
            System.out.print(numero.charAt(tamanho_numero-i-1));
        }

        scanner.close();
    }
}
