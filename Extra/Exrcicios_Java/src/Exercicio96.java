/*
Exercicio 096
Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
Armazene os números pares no vetor PAR e os números IMPARES no vetor impar.
Imprima os três vetores.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio96 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer>numeros = new ArrayList<>();
        List<Integer>numeros_pares = new ArrayList<>();
        List<Integer>numeros_impares = new ArrayList<>();

        for (int i = 0; i<20;i++){
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            numeros.add(numero);

            if(numero%2==0){
                numeros_pares.add(numero);
            }
            else{
                numeros_impares.add(numero);
            }

            System.out.print("Número computado!\n");
        }

        System.out.println("Os números digitados foram: "+numeros);
        System.out.println("Os números impares digitados foram: "+numeros_impares);
        System.out.print("Os números pares digitados foram: "+numeros_pares);

        scanner.close();

    }
}
