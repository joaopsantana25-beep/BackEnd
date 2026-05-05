/*
Exercicio 094
Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
 */

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio94 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Double>notas = new ArrayList<>();
        double media =0;
        double soma = 0;

        for ( int i =0;i<4;i++){
            System.out.print("\nDigite a nota "+(i+1)+": ");
            double nota = scanner.nextDouble();
            System.out.print("Nota Computada!");

            soma+=nota;
            notas.add(nota);
        }

        media = soma/notas.size();

        System.out.println("\nAs suas notas foram: "+notas);
        System.out.printf("A sua média é: %.2f",media);
        scanner.close();
    }
}
