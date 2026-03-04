/*
Exercicio 015
Faça um Programa que pergunte quanto você ganha
por hora e o número de horas trabalhadas no mês.

Calcule e mostre o total do seu salário no referido mês,
sabendo-se que são descontados 11% para o Imposto de Renda,
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto. quanto pagou ao INSS. quanto pagou ao sindicato.
o salário líquido. calcule os descontos e o salário líquido,
conforme a tabela abaixo:

+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.

 */

import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quanto você recebe por hora trabalhada: ");
        float valor_hora = scanner.nextFloat();

        System.out.print("Digite quantas horas você trabalha por mês: ");
        float horas_trabalhadas = scanner.nextFloat();

        //Começo dos calculos

        double salario_bruto = valor_hora*horas_trabalhadas;

        double IR = salario_bruto*0.11;

        double INSS = salario_bruto*0.08;

        double Sindicato = salario_bruto*0.05;

        double salario_liquido = salario_bruto-IR-INSS-Sindicato;

        System.out.printf("\n+ Salário Bruto: R$ %.2f reais",salario_bruto);
        System.out.printf("\n- IR: R$ %.2f reais",IR);
        System.out.printf("\n- INSS: R$ %.2f reais",INSS);
        System.out.printf("\n- Sindicato: R$ %.2f reais",Sindicato);
        System.out.printf("\n= Salario Líquido: R$ %.2f reais",salario_liquido);

        scanner.close();


    }
}
