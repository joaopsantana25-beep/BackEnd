/*
Exercicio 010
Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        float resultado = conversao_C_F();
        System.out.printf("O resultado da conversão é: %.2f °F",resultado);
    }
    public static float conversao_C_F(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");

        float temperaturaCels = scanner.nextFloat();
        float temperaturaFaren = temperaturaCels*9/5 +32;

        scanner.close();
        return temperaturaFaren;
        }
}
