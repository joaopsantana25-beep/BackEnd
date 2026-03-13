/*
Exercicio 052
Faça um programa que leia 5 números e informe o maior número.
 */

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Exercicio52 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int contador=0;

        List<Float> numeros = new ArrayList<>();

        while (true){
            System.out.print("\nDigite um número: ");
            float input = scanner.nextFloat();
            numeros.add(input);

            System.out.print("\nNúmero computado!");

            contador++;
            if (contador==5){
                break;
            }
        }

        Float maximo = Collections.max(numeros);
        System.out.println("\nO maior número digitado foi: "+maximo);
        System.out.println("Fim do programa!");

        scanner.close();
    }
}
