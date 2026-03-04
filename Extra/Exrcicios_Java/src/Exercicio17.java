/*
Exercicio 017
Faça um Programa para uma loja de tintas.

O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.

Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.

Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:


 comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o preço seja o menor.
Acrescente 10% de folga e sempre arredonde os valores para cima,
isto é, considere latas cheias.

*/

import java.util.Scanner;
import java.lang.Math;
public class Exercicio17 {
    public static void main(String[] args){

        //Tabela de preços
        double preco_lata = 80;
        double preco_galao = 25;

        //Requisição de dados
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a área a ser pintada em m²: ");
        double area_pintada = scanner.nextDouble();

        //Calculo de litros necessários
        double litros_necessarios = area_pintada*1.1/6;

        //Calculo de número de latas e galões
        double numero_latas = Math.ceil(litros_necessarios/18);
        double numero_galoes = Math.ceil(litros_necessarios/3.6);

        //Primeira Situação
        double preco_apenas_latas =(numero_latas*preco_lata);
        System.out.printf("\nO valor comprando apenas latas será de: R$ %.2f reais", preco_apenas_latas);

        //Segunda Situação
        double preco_apenas_galoes = (numero_galoes*preco_galao);
        System.out.printf("\nO valor comprando apenas galões será de: R$ %.2f reais", preco_apenas_galoes);

        //Terceira Situação
        int latas_mistura = (int) (litros_necessarios / 18);
        double litros_restantes = litros_necessarios - (latas_mistura * 18);
        int galoes_mistura = (int) Math.ceil(litros_restantes / 3.6);
        double preco_mistura = (latas_mistura * preco_lata) + (galoes_mistura * preco_galao);

        System.out.printf("\nMelhor mistura: %d latas e %d galões, total R$ %.2f",
                latas_mistura, galoes_mistura, preco_mistura);

        scanner.close();
    }
}
