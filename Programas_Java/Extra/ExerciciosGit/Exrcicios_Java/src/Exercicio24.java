/*
Exercicio 024
Faça um Programa que leia três números e mostre o maior deles.
 */

import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.print("O maior número é o "+num1);

        }
        else if(num2>=num1 && num2>=num3){
            System.out.print("O maior número é o "+num2);
        }
        else{
            System.out.print("O maior número é o "+num3);
        }
        scanner.close();
    }
}
