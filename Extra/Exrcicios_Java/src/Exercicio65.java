/*
Exercicio 065
Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
Um número primo é aquele que é divisível somente por ele mesmo e por 1.
 */

import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    boolean primo = true;


    System.out.print("Digite um número para verificar se ele é primo: ");
    int numero = scanner.nextInt();

    if(numero<2){
        System.out.print("O número não é primo");
    }
    else if(numero==2){
        System.out.print("O número é primo");
    }
    else{
        int metade_numero=numero/2;

        for (int i=2;i<=metade_numero;i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        if(primo){
            System.out.print("O número é primo");
        }

        else{
            System.out.print("O número não é primo");
        }

    }

    scanner.close();
    }
}
