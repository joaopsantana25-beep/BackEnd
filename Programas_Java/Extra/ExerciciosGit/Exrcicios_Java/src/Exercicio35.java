/*
Exercicio 035
Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.

 */

import java.util.Scanner;

public class Exercicio35 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um ano: ");
    int ano = scanner.nextInt();

    int resto = ano%4;

    if (resto!=0){
        System.out.print("O ano não é bissexto");
    }
    else{
        System.out.print("O ano é bissexto");
    }

    scanner.close();
}
}
