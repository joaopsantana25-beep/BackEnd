/*
Problema 1: Escrevendo métodos
Visão Geral
Neste exercício, você escreverá métodos que retornam valores para os seguintes cenários:
1. Converte a temperatura fornecida de Fahrenheit para Celsius.
Fórmula:
C=5/9*(F-32)
 */

import java.util.Scanner;

public class Item1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double Fahr= scanner.nextDouble();

        double Celsius = conversao_F_C(Fahr);

        System.out.printf("A temperatura em Celsius é: %.2f ºC",Celsius);
        scanner.close();
    }

    public static double conversao_F_C(double F){

        return 5*(F-32)/9;
    }
}
