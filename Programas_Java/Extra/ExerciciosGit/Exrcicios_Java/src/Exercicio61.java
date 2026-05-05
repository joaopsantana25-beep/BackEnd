/*
Exercicio 061
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

 */

import java.util.Scanner;
public class Exercicio61 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int resultado = 0;

        System.out.print("Digite o número que você deseja fazer o fatorial: ");
        int numero = scanner.nextInt();

        if (numero==0){
            System.out.print("O fatorial de 0 é 1");
        }
        else if(numero<0){
            System.out.print("O número precisa ser positivo");
        }
        else{
            resultado=1;
            for (int i =numero;i>=1;i--){
                resultado *=i;

            }

            System.out.print("O resultado de "+numero+"! é : "+resultado);
        }
        scanner.close();

    }
}
