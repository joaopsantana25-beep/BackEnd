/*
Exercicio 098
Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio98 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int soma=0,multiplicacao=1;

        List<Integer>numeros_inteiros=new ArrayList<>();

        for (int i =0;i<5;i++){
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            numeros_inteiros.add(numero);
            System.out.print("Número Computado!\n");

            soma+=numero;
            multiplicacao*=numero;
        }

        System.out.println("Os números digitados foram: "+numeros_inteiros);
        System.out.println("O resultado da soma dos números é: "+soma);
        System.out.println("O resultado do produto dos números é: "+multiplicacao);

        scanner.close();
    }
}
