/*
Exercicio 082
Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados:
valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.

Os juros e a quantidade de parcelas seguem a tabela abaixo: Quantidade de Parcelas % de Juros sobre o valor inicial da dívida
1 0
3 10
6 15
9 20
12 25

Exemplo de saída do programa:
Valor da Dívida: 1000     1100 1150
Valor dos Juros: 0        1000 150
Quantidade de Parcelas:1  3    6
Valor da Parcela: 1000  366  191,67

 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Exercicio82 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Double>juros = new ArrayList<>();

        System.out.print("Tabela de juros por parcela");
        System.out.print("\n_____________________________\n");
        System.out.println("Parcelas | Juros");

        for (int i=0;i<5;i++) {
            int parcela = i*3;
            double juros_da_parcela=5+i*5;

            if (parcela==0){
                parcela=1;
                juros_da_parcela=0;
            }

            System.out.print(parcela + "            "+juros_da_parcela+"\n");
            juros.add(juros_da_parcela);
        }


        System.out.print("Digite o valor da dívida: ");
        double divida = scanner.nextDouble();

        System.out.print("Digite o número de parcelas: ");
        int numero_parcelas = scanner.nextInt();

        System.out.println("Saída");
        System.out.print("\n_____________________________\n");

        double Valor_divida_Juros=divida*(1+ ((juros.get(numero_parcelas/3)))/100);

        System.out.printf("Valor da Dívida: R$ %.2f  \n",Valor_divida_Juros);
        System.out.printf("Valor dos Juros: R$ %.2f  \n",(Valor_divida_Juros-divida));
        System.out.printf("Quantidade de Parcelas: %d \n",numero_parcelas);
        System.out.printf("Valor da Parcela: R$ %.2f ",(Valor_divida_Juros/numero_parcelas));


        scanner.close();

    }
}
