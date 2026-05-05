/*
Exercicio 009
Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
 */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        float resultado = conversao_F_C();
        System.out.printf("O resultado da conversão é: %.2f °C",resultado);
    }

    public static float conversao_F_C(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Farenheit: ");
        float temperaturaFar = scanner.nextFloat();

        float temperaturaCel = (5*(temperaturaFar-32)/9);
        scanner.close();

        return temperaturaCel;
    }
}
