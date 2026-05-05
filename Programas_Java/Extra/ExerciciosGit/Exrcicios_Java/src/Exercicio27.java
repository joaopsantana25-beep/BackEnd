/*
Exercicio 027
Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            System.out.print("A sequencia de números é: " + num1 + " ," + num2 + " ," + num3);
        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
            System.out.print("A sequencia de números é: " + num1 + " ," + num3 + " ," + num2);
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
            System.out.print("A sequencia de números é: " + num2 + " ," + num1 + " ," + num3);

        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
            System.out.print("A sequencia de números é: " + num2 + " ," + num3 + " ," + num1);
        }
         else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
        System.out.print("A sequencia de números é: " + num3 + " ," + num2 + " ," + num1);
    }
    else {
            System.out.print("A sequencia de números é: " + num3 + " ," + num1 + " ," + num2);
        }
scanner.close();
    }
}
