/*
Estruturas de decisão
Exercicio 019
Faça um Programa que peça dois números e imprima o maior deles.

 */

import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1>num2){
        System.out.print(num1+ " é o maior número");
    }
        else if(num2>num1){
            System.out.print(num2+ " é o maior número");
        }
        else{
            System.out.print("Os dois números são iguais");
        }
        scanner.close();
        }

}
