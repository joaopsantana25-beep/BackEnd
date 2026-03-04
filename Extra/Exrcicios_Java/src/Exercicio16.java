/*
Exercicio 016
Faça um programa para uma loja de tintas.
O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.

Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.

Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio16 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a área a ser pintada em m²: ");
    double area_pintada = scanner.nextDouble();

    double litros_necessarios = Math.ceil(area_pintada/3);

    double numero_latas = Math.ceil(litros_necessarios/18);

    double preco_total =(numero_latas*80);

    System.out.print("\nO número de latas para pintas a área de "+area_pintada+" m² é de: "+numero_latas);
    System.out.printf("\nO valor gasto será: R$ %.2f reais", preco_total);
    scanner.close();


    }
}
