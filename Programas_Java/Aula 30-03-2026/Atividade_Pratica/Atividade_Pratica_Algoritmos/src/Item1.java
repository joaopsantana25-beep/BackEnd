/*
Crie um programa que leia um número
inteiro e mostre seu sucessor
 */

import java.util.Scanner;

public class Item1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x,sucessor;

        System.out.print("Digite o valor do número: ");
        x = scanner.nextInt();

        sucessor = x+1;

        System.out.print("O sucesor de x é: "+sucessor);
        scanner.close();
    }
}
