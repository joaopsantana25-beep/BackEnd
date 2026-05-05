/*
Exercicio 045
O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:

                  Até 5 Kg           Acima de 5 Kg
File Duplo R$ 4,90 por Kg            R$ 5,80 por Kg
Alcatra R$ 5,90 por Kg               R$ 6,80 por Kg
Picanha R$ 6,90 por Kg               R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
porém não há limites para a quantidade de carne por cliente.

Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra.

Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal,
contendo as informações da compra:

*tipo de carne quantidade de carne
*preço total
*tipo de pagamento
*valor do desconto
*valor a pagar.

 */

import java.util.Scanner;

public class Exercicio45 {
public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);

    //Variaveis dos preços das carnes
    double preco_file_kg=4.90;
    double preco_alcatra_kg=5.90;
    double preco_picanha_kg=6.90;

    //Variáveis nos descontos
    double desconto_cartao=0;
    double valor_desconto=0;
    String tipo_pagamento="Cartão Normal";
    String  tipo_carne="";

    //Precos
    double valor_total=0;
    double valor_final=0;



    System.out.print("Digite o tipo de carne que você comprou ('F' para filé, 'A' para alcatra,'P' para picanha): ");
    String leitura_carne = scanner.nextLine().toUpperCase();


    System.out.print("Digite quantos quilos foram comprados: ");
    double kg_comprados=scanner.nextDouble();

    System.out.print("Você usará o cartão Tabajara para fazer a compra (S/N): ");
    scanner.nextLine();
    String leitura_pagamento = scanner.nextLine().toUpperCase();


    //Ifs

    //Verificacao se é o cartão tabajara ou não
    if (leitura_pagamento.equals("S")){
        tipo_pagamento="Cartão Tabajara";
        desconto_cartao=0.05;
    }

    //Definir os valores das carnes se ultrapassar o kg limite para mudar os precos
    if (kg_comprados>5){
        preco_file_kg=5.80;
        preco_picanha_kg=7.80;
        preco_alcatra_kg=6.80;
    }

    //Definição do tipo de carne se baseando no input do usuário além de definir o valor total da compra
    if (leitura_carne.equals("F")){
        tipo_carne = "Filé de Frango";
        valor_total=kg_comprados*preco_file_kg;
    }
    else if (leitura_carne.equals("A")){
        tipo_carne="Alcatra";
        valor_total=kg_comprados*preco_alcatra_kg;
    }
    else if(leitura_carne.equals("P")){
        tipo_carne="Picanha";
        valor_total=kg_comprados*preco_picanha_kg;
    }

    //Definição dos valores de desconto devido ao cartao e valor final da operacao

    valor_desconto=valor_total*desconto_cartao;
    valor_final=valor_total-valor_desconto;

    //Prints
    System.out.print("\n-----------------------------------------");
    System.out.print("Nota Fiscal");
    System.out.print("-----------------------------------------");
    System.out.print("\nCarne comprada: "+tipo_carne);
    System.out.printf("\nKilos comprados: %.2f Kg ",kg_comprados);
    System.out.print("\nTipo de pagamento: "+tipo_pagamento);
    System.out.printf("\nPreço total: R$ %.2f reais ",valor_total);
    System.out.printf("\nValor do desconto: R$ %.2f reais ",valor_desconto);
    System.out.printf("\nPreço final: R$ %.2f reais ",valor_final);


    scanner.close();

}
}
