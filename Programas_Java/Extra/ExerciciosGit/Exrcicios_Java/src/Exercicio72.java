/*

Exercicio 072
Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles.
O usuário deverá informar a quantidade de CDs e o valor para em cada um.
 */

import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float cds_validados=0;
        float soma = 0;
        float media=0;

        System.out.print("Digite o número de CD's: ");
        int numero_de_cds = scanner.nextInt();

        if(numero_de_cds<=0){
            System.out.print("Nenhum cd foi comprado\nFim do Programa!");
            scanner.close();
        }
        else {

            while (true) {
                System.out.print("Digite o preço do cd: ");
                float preco_cd = scanner.nextFloat();

                if (preco_cd < 0) {
                    System.out.print("\nValor inválido!\n");
                    continue;
                }

                soma += preco_cd;
                cds_validados++;

                System.out.print("\nValor Computado!\n");

                if (cds_validados == numero_de_cds) {
                    break;
                }

            }

            media=soma/cds_validados;
            System.out.printf("Foram comprados %.0f CD's, o gasto total com cds foi de R$ %.2f reais e a média de gasto por cd é de R$ %.2f reais por CD.",cds_validados,soma,media);
            System.out.print("\nFim do Programa!");
            scanner.close();

        }
    }
}
