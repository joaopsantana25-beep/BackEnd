/*
Exercicio 100
Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.
 */

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Exercicio100 {
    public static void main(String[] args){
        Random gerador = new Random();
        int soma = 0;

        List<Integer>A=new ArrayList<>();

        for (int i =0;i<10;i++){
            int numero = gerador.nextInt(100);
            A.add(numero);
        }

        for (int i =0;i<10;i++){
            int numero = A.get(i);
            int quadrado = numero*numero;
            soma+=quadrado;
        }

        System.out.println("Os números do vetor são: "+A);
        System.out.println("A soma dos quadrados é: "+soma);

    }
}
