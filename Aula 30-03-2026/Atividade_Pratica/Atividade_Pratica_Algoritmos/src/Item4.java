/*
Crie um programa que leia uma idade de uma pessoa e calcule quantos dias essa
pessoa já viveu.
 */

import java.util.Scanner;
public class Item4 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int idade,diasVividos;

    System.out.print("Digite a su idade: ");
    idade = scanner.nextInt();

    diasVividos = idade*365;

    System.out.print("Você já viveu "+diasVividos+" dias");
    scanner.close();
  }
}
