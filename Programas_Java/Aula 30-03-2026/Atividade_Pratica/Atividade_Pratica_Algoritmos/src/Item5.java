/*
Crie um programa que lê dois números, X e Y, e mostra o resto da divisão entre
eles.
 */

import java.util.Scanner;

public class Item5 {
 public  static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     int x,y,resto;

     System.out.print("Digite o valor de x: ");
     x=scanner.nextInt();


     System.out.print("Digite o valor de y: ");
     y=scanner.nextInt();

     resto = x%y;

     System.out.print("O resto da divisão de x por y é: "+resto);
     scanner.close();
 }
}
