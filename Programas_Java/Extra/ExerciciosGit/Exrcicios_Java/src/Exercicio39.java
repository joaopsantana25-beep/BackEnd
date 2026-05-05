/*
Exercicio 039
Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão).

 */

import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (par_impar(numero)){
            System.out.print("É um número par");
        }
        else{
            System.out.print("É um número ímpar");
        }

        scanner.close();

    }
    public static boolean par_impar(int numero){
        boolean status = false;

        if (numero%2==0){
            status = true;
        }

        return status;
    }
}

