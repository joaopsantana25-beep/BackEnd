/*Crie um programa que lê dois números inteiros, X e Y, e mostre o resultado da
multiplicação de x por y.
*/

import java.util.Scanner;
public class Item3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x,y,resultado;

        System.out.print("Digite o valor de x: ");
        x = scanner.nextInt();

        System.out.print("Digite o valor de y: ");
        y = scanner.nextInt();

        resultado = x*y;

        System.out.print("O resultado de x * y é: "+resultado);

        scanner.close();
    }

}
