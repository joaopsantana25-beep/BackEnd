/*
Crie um programa que leia um número inteiro e mostre seu antecessor.
 */

import java.util.Scanner;

public class Item2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x,antecessor;

        System.out.print("Digite o valor do número: ");
        x = scanner.nextInt();

        antecessor=x-1;

        System.out.print("O antecessor de x é: "+antecessor);

        scanner.close();

    }
}
