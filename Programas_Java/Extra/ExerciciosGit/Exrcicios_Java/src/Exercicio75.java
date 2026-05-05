/*
Exercicio 075
O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências.

Faça um programa que implemente uma caixa registradora rudimentar.

O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias.

Um valor zero deve ser informado pelo operador para indicar o final da compra.

O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.

Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra.

A saída deve ser conforme o exemplo abaixo: Lojas Tabajara Produto 1: R$ 2.20 Produto 2: R$ 5.80 Produto 3: R$ 0 Total: R$ 9.00 Dinheiro: R$ 20.00 Troco: R$ 11.00
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio75 {
public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);

    while(true){
    float soma = 0;
    float numero_produtos=0;

    List<Float>lista_de_precos = new ArrayList<>();

    while (true){
        System.out.print("Digite o valor do produto (Para sair digite 0): ");
        float valor_produto = scanner.nextFloat();

        if (valor_produto==0){
            System.out.print("\nSaindo...\n");
            break;
        }

        if (valor_produto<0){
            System.out.print("\nValor inválido!\n");
            continue;
        }

        System.out.print("\nValor Computado!\n");

        lista_de_precos.add(valor_produto);
        soma+=valor_produto;
        numero_produtos++;


    }
    if (numero_produtos==0){
        System.out.print("\nNenhum produto foi computado!\n");
    }
    else{
        System.out.printf("O valor total deu: R$ %.2f reais",soma);
        System.out.print("\nDigite o valor fornecido pelo cliente: ");
        float valor_cliente = scanner.nextFloat();

        float troco = (valor_cliente-soma);

        //Print das Informações

        System.out.print("\nLojas Tabajara\n");
        System.out.print("------------------------------\n");

        for (int i =0;i<numero_produtos;i++){
            System.out.print("Produto "+(i+1)+": R$: ");
            System.out.printf("%.2f",lista_de_precos.get(i));
            System.out.print("\n");
        }

        System.out.print("------------------------------\n");
        System.out.printf("Total: R$ %.2f reais %n",soma);
        System.out.printf("Dinheiro: R$ %.2f reais %n",valor_cliente);
        System.out.printf("Troco: R$ %.2f reais %n",troco);

        System.out.print("\nVocê deseja registrar outra compra(s/n): ");
        scanner.nextLine();
        String input=scanner.nextLine().toLowerCase();

        if (input.equals("n")){
            break;
        }
    }
    }

    System.out.print("Fim do Programa");
    scanner.close();
}
}
