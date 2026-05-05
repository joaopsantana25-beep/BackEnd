/*

Exercicio 059
Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de
números pares e a quantidade de números impares.

 */
import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int entrada;
        int numeros_pares=0;
        int numeros_impares=0;

        for (int i=0;i<10;i++){
            System.out.print("\nDigite um número: ");
             entrada = scanner.nextInt();
             System.out.print("\nNúmero Computado!");

             if (entrada%2==0){
                 numeros_pares++;
             }
             else{
                 numeros_impares++;
             }
        }

        System.out.print("\nForam digitados "+numeros_pares+" números pares e "+numeros_impares+" números ímpares.");
        scanner.close();
    }
}
