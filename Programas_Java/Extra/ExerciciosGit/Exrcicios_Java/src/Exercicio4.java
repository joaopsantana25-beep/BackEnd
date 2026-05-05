/*
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */

import  java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite a primeira nota: ");
        float nota1 = scanner.nextInt();

        System.out.print("Por favor, digite a segunda nota: ");
        float nota2 = scanner.nextInt();

        System.out.print("Por favor, digite a terceira nota: ");
        float nota3 = scanner.nextInt();

        System.out.print("Por favor, digite a quarta nota: ");
        float nota4 = scanner.nextInt();

        float media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A média das 4 notas digitadas é: "+media);
        scanner.close();
    }
}
