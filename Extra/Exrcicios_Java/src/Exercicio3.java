/*
Exercicio 003
Faça um Programa que peça dois números e imprima a soma.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Por favor digite o primeiro número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma dos dois números digitados é: "+soma);

        scanner.close();



    }
}
