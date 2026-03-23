/*
Exercicio 084
O cardápio de uma lanchonete é o seguinte: Especificação Código Preço

Cachorro Quente 100 R$ 1,20
Bauru Simples 101 R$ 1,30
Bauru com ovo 102 R$ 1,50
Hambúrguer 103 R$ 1,20
Cheeseburguer 104 R$ 1,30
Refrigerante 105 R$ 1,00

Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.

Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido.

Considere que o cliente deve informar quando o pedido deve ser encerrado.
*/

import java.util.ListIterator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio84 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer>lista_codigos = new ArrayList<>();
        List<Integer>quantidade_pedida = new ArrayList<>();
        List<String>itens_pedidos = new ArrayList<>();
        List<Double>preco_por_item = new ArrayList<>();

        while (true){
            System.out.print("Digite o código do item que você deseja: ");
            int codigo = scanner.nextInt();

            if (codigo==0){
                System.out.println("Fim do Pedido!");
                break;
            }

            if (codigo<100 || codigo>105){
                System.out.println("Código inválido!");
                continue;
            }

            System.out.print("Digite a quantidade do item que você deseja: ");
            int quantidade = scanner.nextInt();

            if (quantidade<=0){
                System.out.println("Quantidade Inválida!");
                continue;
            }

            lista_codigos.add(codigo);
            quantidade_pedida.add(quantidade);

            System.out.println("Pedido Anotado");
        }

        if(lista_codigos.size()>0) {

            double total = 0;


            for (int i = 0; i < lista_codigos.size(); i++) {
                int codigo_produto = lista_codigos.get(i);
                int quantidade_produto = quantidade_pedida.get(i);
                double valor_individual = 0;


                if (codigo_produto == 100) {
                    itens_pedidos.add("Cachorro Quente");
                    valor_individual = quantidade_produto * 1.20;
                }
                if (codigo_produto == 101) {
                    itens_pedidos.add("Bauru Simples");
                    valor_individual = quantidade_produto * 1.30;
                }
                if (codigo_produto == 102) {
                    itens_pedidos.add("Bauru com Ovo");
                    valor_individual = quantidade_produto * 1.50;
                }
                if (codigo_produto == 103) {
                    itens_pedidos.add("Hamburguer");
                    valor_individual = quantidade_produto * 1.20;
                }
                if (codigo_produto == 104) {
                    itens_pedidos.add("ChessBurguer");
                    valor_individual = quantidade_produto * 1.30;
                }
                if (codigo_produto == 105) {
                    itens_pedidos.add("Refrigerante");
                    valor_individual = quantidade_produto * 1.30;
                }

                total += valor_individual;
                preco_por_item.add(valor_individual);

            }

            //Saída do Programa

            System.out.println("\nDados do seu pedido: ");
            System.out.println("_________________________");

            for (int i = 0; i < itens_pedidos.size(); i++) {
                System.out.print(itens_pedidos.get(i) + " * " + quantidade_pedida.get(i) + " = R$ ");
                System.out.printf("%.2f \n", preco_por_item.get(i));

            }

            System.out.printf("Total: R$ %.2f", total);
        }
        else{
            System.out.println("Nenhum item foi pedido!\nFim do Programa!");

        }

        scanner.close();
    }
}
