/*
Faça um programa que pergunte o preço de três produtos
e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */

import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String produto1 = "banana";
        String produto2 = "melão";
        String produto3 = "melancia";

        System.out.print("Digite o preço da " + produto1 + " :");
        float preco_banana = scanner.nextFloat();

        System.out.print("Digite o preço da " + produto2 + " :");
        float preco_melao = scanner.nextFloat();

        System.out.print("Digite o preço da " + produto3 + " :");
        float preco_melancia = scanner.nextFloat();

        if (preco_banana <= preco_melao && preco_banana <= preco_melancia) {
            System.out.println("Você deve comprar " + produto1);

        } else if (preco_melao <= preco_banana && preco_melao <= preco_melancia) {
            System.out.println("Você deve comprar " + produto2);
        } else {
            System.out.println("Você deve comprar " + produto3);

        }
        scanner.close();

    }
}
