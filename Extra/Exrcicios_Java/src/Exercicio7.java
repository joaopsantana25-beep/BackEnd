/*
Exercicio 007
Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 */

import java.util.Scanner;
import java.math.*;

public class Exercicio7 {
    public static void main(String[] args){
        float resultado = areaQuadrado();
        System.out.println("A área do quadrado é: "+resultado+" ua²");

    }

    public static float areaQuadrado(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor digite o lado do quadrado: ");
        float lado = scanner.nextFloat();
        float areaQuadrado = lado*lado;
        scanner.close();

         return areaQuadrado;
    }
}
