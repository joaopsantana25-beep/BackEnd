/*
Exercicio 006
Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio6 {
    public static void main(String[] args){
        float area = AreaCirculo();
        System.out.println("A área do cículo é: "+area+"cm²");

    }

    public static float AreaCirculo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite o raio do círculo: ");
        float raio = scanner.nextFloat();
        double pi = Math.PI;
        float pi_Float = (float) pi;
        scanner.close();

        return pi_Float*raio*raio;

    }
}
