/*
Exercicio 043
Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool:
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro

Gasolina:
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia:
*O número de litros vendidos
*O tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina)
*Calcule e imprima o valor a ser pago pelo cliente sabendo-se que:

*O preço do litro da gasolina é R$ 2,50
*O preço do litro do álcool é R$ 1,90.

 */

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        //Variáveis de preço
        double preco_gasolina = 2.50;
        double preco_alcool=1.90;
        double preco_total=0;

        //Descontos
        double desconto_alcool = 0.03;
        double desconto_gasolina=0.04;

        //Leitura da quantidade de litros e tipo
        System.out.print("Digite o tipo de combustível foi comprado: ");
        String tipo = scanner.nextLine();

        System.out.print("Digite quantos litros de combustível foram comprados: ");
        double litros_consumidos = scanner.nextDouble();

        if (tipo.equals("A")){
            if (litros_consumidos>20){
                desconto_alcool=0.05;
            }

            preco_total =litros_consumidos*preco_alcool*(1-desconto_alcool);

        }
        else if(tipo.equals("G")){

            if (litros_consumidos>20){
                desconto_gasolina=0.06;
            }

             preco_total =litros_consumidos*preco_gasolina*(1-desconto_alcool);

        }

        System.out.printf("\nO valor da sua compra é: R$ %.2f reais",preco_total);
        scanner.close();

    }
}
