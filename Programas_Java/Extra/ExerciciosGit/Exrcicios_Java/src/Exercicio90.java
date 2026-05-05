/*
Exercicio 090
Faça um programa que mostre os n termos da Série a seguir: S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
 Imprima no final a soma da série.
 */

import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o n-ésimo termo da série: ");
        int numero = scanner.nextInt();

        int n = 1;
        int m = 1;
        double soma = 0;

        System.out.print("S = ");

        for (int i = 0; i < numero; i++) {

            System.out.print(n + "/" + m);

            if (i < numero - 1) {
                System.out.print(" + ");
            }

            soma += (double) n / m;

            n++;
            m += 2;
        }

        System.out.print("\nA soma dos termos é: "+soma);

        scanner.close();
    }
}