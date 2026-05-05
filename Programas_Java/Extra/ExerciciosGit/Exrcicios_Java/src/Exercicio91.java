/*

Exercicio 091
Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N,
Faça um programa que calcule o valor de H com N termos.
 */

import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digte o valor do n-ésimo termo: ");
        int numero = scanner.nextInt();

        double H=0;
        int N=1;

        System.out.print("H= ");

        for (int i =0;i<numero;i++){
            System.out.print(1 + "/" + N);
            H+=(1/(double)N);
            N++;

            if(i<numero-1){
                System.out.print(" + ");
            }

        }

        System.out.print("\nO valor de H é: "+H);
        scanner.close();


    }
}
