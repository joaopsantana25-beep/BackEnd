/*
Exercicio 038
Faça um Programa para um caixa eletrônico.

O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas.

As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais.

O programa não deve se preocupar com a quantidade de notas existentes na máquina.

Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;

Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

 */

import java.util.Scanner;
public class Exercicio38 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String palavras[] = {
                "uma nota",
                "duas notas",
                "três notas",
                "quatro notas",
                "cinco notas",
                "seis notas",
                "sete notas",
                "oito notas",
                "nove notas"
        };

        System.out.print("Digite um número maior que 10 e menor que 600: ");
        int valor = scanner.nextInt();

        if (valor<10 || valor>600){
            System.out.print("Por favor digite um valor válido!");
        }
        else{

            int notas_de_100= valor/100;
            int notas_de_50=(valor%100)/50;
            int notas_de_10=(valor%50)/10;
            int notas_de_5=(valor%10)/5;
            int notas_de_1=(valor%5);

            System.out.print("Para sacar a quantia de "+valor+" reais, o programa fornce ");

            if (notas_de_100>=1){
                System.out.print(palavras[notas_de_100-1]+" de 100");
            }
            if (notas_de_50>=1){
                System.out.print("," +palavras[notas_de_50-1]+" de 50");
            }
            if (notas_de_10>=1){
                System.out.print(","+palavras[notas_de_10-1]+" de 10");
            }
            if (notas_de_5>=1){
                System.out.print(","+palavras[notas_de_5-1]+" de 5");
            }
            if (notas_de_1>=1){
                System.out.print(" e"+palavras[notas_de_1-1]+" de 1");
            }

            scanner.close();
        }
    }
}
