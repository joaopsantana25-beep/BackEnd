/*
Exercicio 055
Faça um programa que receba dois números inteiros e gere os números inteiros
que estão no intervalo compreendido por eles.

 */

import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro que será o começo do intervalo: ");
        int comeco_ciclo = scanner.nextInt();

        System.out.print("Digite o número inteiro que será o fim do intervalo: ");
        int final_ciclo= scanner.nextInt();

        for (int i =comeco_ciclo+1;i<final_ciclo;i++){
            System.out.println(i);

        }
        scanner.close();

    }

}
