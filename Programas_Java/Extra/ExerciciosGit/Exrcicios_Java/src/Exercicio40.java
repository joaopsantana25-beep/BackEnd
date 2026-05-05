/*
Exercicio 040
Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.

 */

import java.util.Scanner;
public class Exercicio40 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número que pode ser inteiro ou decimal: ");
        float numero = scanner.nextFloat();

        int Int_numero = (int) numero;

        if (Int_numero==numero){
            System.out.print("O número é inteiro");
        }
        else{
            System.out.print("O número é decimal");
        }
        scanner.close();
    }
}
