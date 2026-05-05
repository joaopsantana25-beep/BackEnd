/*
Exercicio 020
Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 */

import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        if (valor>0){
            System.out.print("O valor é positivo");
        }
        else if(valor<0){
            System.out.print("O valor é negativo");
        }
        else{
            System.out.print("O valor é nulo");
        }

        scanner.close();
    }
}
