/*
Exercicio 044
Uma fruteira está vendendo frutas com a seguinte tabela de preços:

                  Até 5 Kg           Acima de 5 Kg
Morango R$ 2,50 por Kg               R$ 2,20 por Kg
Maçã    R$ 1,80 por Kg               R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
receberá ainda um desconto de 10% sobre este total.

Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas
 e escreva o valor a ser pago pelo cliente.

 */

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Variáveis de Preço
        double precoMorangoKg = 2.50;
        double precoMacaKg = 1.80;

        //Variaiveis desconto
        double descontoTotal=0.10;


        //Variáveis de Peso
        double kilosMorango = 0;
        double kilosMaca=0;
        double kilosTotais= kilosMorango + kilosMaca;

        //Variaveis de valor
        double valor_total=0;
        double precoTotalMorango = kilosMorango*precoMorangoKg;
        double precoTotalMaca=kilosMaca*precoMacaKg;

        //Programa
        System.out.print("Digite quantos quilos de morango você comprou: ");
        kilosMorango=scanner.nextDouble();

        System.out.print("Digite quantos quilos de maçã você comprou: ");
        kilosMaca=scanner.nextDouble();

        kilosTotais= kilosMorango + kilosMaca;

        //Ifs

        if (kilosMorango>5){
            precoMorangoKg=2.20;
        }
        if (kilosMaca>5){
            precoMacaKg=1.50;
        }

        precoTotalMaca=kilosMaca*precoMacaKg;
        precoTotalMorango = kilosMorango*precoMorangoKg;

        valor_total=precoTotalMorango+precoTotalMaca;

        if (kilosTotais>8 || valor_total>25){
            valor_total*=(1-descontoTotal);
        }

        //Print final

        System.out.printf("Você comprou %.2f kilos de morango, ",kilosMorango);
        System.out.printf("%.2f kilos de maça, ",kilosMaca);
        System.out.printf("Dando ao todo um total de %.2f kilos de frutas. ",kilosTotais);
        System.out.printf("O valor total de sua compra é: R$ %.2f reais",valor_total);

        scanner.close();
    }
}
