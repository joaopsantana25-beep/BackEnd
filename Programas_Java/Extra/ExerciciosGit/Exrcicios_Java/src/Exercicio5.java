/*
Exercicio 005
Faça um Programa que converta metros para centímetros.
 */

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        float resultado = conversaoMparaCm();
        System.out.println("A conversão do valor digitado para cm é: "+resultado+" cm");

    }

    public static float conversaoMparaCm(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor digite o valor para a conversão: ");
        float metro = scanner.nextFloat();
        return metro*100;
    }
}
