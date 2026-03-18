/*
Exercicio 074
O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha,
 que já é um sucesso na sua loja de 1,99.

Você foi contratado para desenvolver o programa que monta a tabela de preços de pães,
de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:

Preço do pão: R$ 0.18
Panificadora Pão de Ontem - Tabela de preços

1 - R$ 0.18
2 - R$ 0.36
...
50 - R$ 9.00
 */

import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do pão: ");
        float preco_pao = scanner.nextFloat();

        System.out.print("Preço do Pão: "+preco_pao);
        System.out.print("\nPanificado Pão de Ontem - Tabela de Preços: ");
        System.out.print("\n------------------------------------------------------\n");
        for (int i =1;i<=50;i++){
            System.out.print(i + " - ");
            System.out.printf("%.2f %n",(preco_pao*i));
        }
        scanner.close();
    }
}
