/*
Exercicio 106
Utilize uma lista para resolver o problema a seguir. Uma empresa paga seus vendedores com base em comissões.
O vendedor recebe $200 por semana mais 9 por cento de suas vendas brutas daquela semana.
Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana recebe $200 mais 9 por cento de $3000, ou seja, um total de $470.
Escreva um programa (usando um array de contadores) que determine quantos vendedores receberam salários nos seguintes intervalos de valores:
 $200 - $299
 $300 - $399
 $400 - $499
 $500 - $599
 $600 - $699
 $700 - $799
 $800 - $899
 $900 - $999
 $1000 em diante
 Desafio: Crie ma fórmula para chegar na posição da lista a partir do salário, sem fazer vários ifs aninhados.

 */

import java.util.*;

public class Exercicio106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> vendedores = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            vendedores.add(0);
        }

        System.out.print(vendedores);

        while (true) {
            System.out.print("\nDigite o valor das vendas do vendedor: ");
            double vendas = scanner.nextDouble();

            double salario = 200 + vendas * 0.09;
            System.out.print(salario);

            int posicao_lista = (int) (salario / 100) - 2;

            if (posicao_lista > 8) {
                posicao_lista = 8;
            }

            //Adicionar o vendedor em sua devida faixa salarial
            vendedores.set(posicao_lista, vendedores.get(posicao_lista) + 1);

            System.out.print("\nVocê deseja continuar: ");
            scanner.nextLine();
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("n")) {
                System.out.print("\nFim do programa\n");
                break;
            }
        }

        for (int i = 0; i < vendedores.size();i++) {

            int numero_vendedores = vendedores.get(i);

            if(i<8) {
                System.out.println("Na faixa dos vendedores que ganham de R$" + ((i + 2) * 100) + " a R$" + (299 + i * 100) + " existem " + numero_vendedores + " vendedores");
            }
            else {
                System.out.println("Na faixa dos vendedores que ganham mais de R$1000 reais existem "+numero_vendedores+ " vendedores");
            }
        }

        scanner.close();
    }

}
