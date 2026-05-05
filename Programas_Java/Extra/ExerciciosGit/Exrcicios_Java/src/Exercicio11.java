/*
Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
o produto do dobro do primeiro com metade do segundo.
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo.
 */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        float num3 = scanner.nextFloat();


        float resultado1 = 2 * num1 * num2 / 2;
        float resultado2 = 3 * num1 + num3;
        float resultado3 = num3 * num3 * num3;

        System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro " + resultado2);
        System.out.println("O terceiro elevado o cubo: " + resultado3);
        scanner.close();

    }
}
