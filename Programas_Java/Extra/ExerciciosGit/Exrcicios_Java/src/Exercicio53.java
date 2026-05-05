/*
Exercicio 053
Faça um programa que leia 5 números e informe a soma e a média dos números.

 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio53 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int contador=0;
        float soma=0;

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

        for (float i : numeros){
            soma +=i;
        }

        float media = soma/5;

        System.out.printf("A soma dos números digitados é: %.2f .\nE a média é: %.2f",soma,media);
        scanner.close();
        }


}
