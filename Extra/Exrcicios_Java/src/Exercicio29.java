/*
Exercicio 029
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.

Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:

salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
    aumento de 5% Após o aumento ser realizado,
informe na tela:
    o salário antes do reajuste;
    o percentual de aumento aplicado;
    o valor do aumento;
    o novo salário, após o aumento.
 */

import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o seu salário para o reajuste: ");
    double salario_base = scanner.nextDouble();
    double novo_salario;
    double reajuste;

    //Determinação do Reajuste baseado no salário
    if (salario_base<=280){
        reajuste = 1.20;
    }
    else if(salario_base<=700){
        reajuste = 1.15;
    }
    else if(salario_base<=1500){
        reajuste = 1.10;
    }
    else{
        reajuste = 1.05;
    }

    //Configuração do Salário
    novo_salario=salario_base*reajuste;

    //Print do novo salário e informações

        System.out.println("Seu salário era: R$ "+salario_base);
        System.out.printf("O reajuste aplicado será de : %.0f%%  %n",((reajuste-1)*100));
        System.out.printf("O valor do seu aumento será: R$ %.2f reais %n ",(novo_salario-salario_base));
        System.out.printf("Seu novo salário será de: R$ %.2f reais %n",novo_salario);

        scanner.close();
    }
}
