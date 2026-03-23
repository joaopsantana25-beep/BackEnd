/*
Exercicio 083
Faça um programa que leia uma quantidade
indeterminada de números positivos e conte quantos deles estão nos seguintes intervalos:
[0-25], [26-50], [51-75] e [76-100].

A entrada de dados deverá terminar quando for lido um número negativo.
 */

import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int contador0_25=0;
        int contador26_50=0;
        int contador51_75=0;
        int contador76_100=0;

        while (true){
            System.out.print("Digite um número de 0 a 100: ");
            float numero = scanner.nextFloat();

            if (numero<0){
                System.out.println("Fim do Ciclo!");
                break;
            }
            if(numero>100){
                System.out.print("Número Inválido\n");
                continue;
            }

            if(numero<=25){
                contador0_25++;
            }
            else if(numero<=50){
                contador26_50++;
            }
            else if(numero<=75){
                contador51_75++;
            }
            else{
                contador76_100++;
            }

            System.out.print("Número Computado!\n");

        }

        System.out.println("Foram digitados "+contador0_25+" números de 0 a 25");
        System.out.println("Foram digitados "+contador26_50+" números de 26 a 50");
        System.out.println("Foram digitados "+contador51_75+" números de 51 a 75");
        System.out.println("Foram digitados "+contador76_100+" números de 76 a 100");

        scanner.close();

    }
}
