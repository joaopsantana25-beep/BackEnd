/*
Exercicio 030
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do
Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 10% para o INSS
e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).

O Salário Líquido corresponde ao Salário Bruto menos os descontos.
O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

Desconto do IR:
 Salário Bruto até 900 (inclusive) - isento
 Salário Bruto até 1500 (inclusive) - desconto de 5%
 Salário Bruto até 2500 (inclusive) - desconto de 10%
 Salário Bruto acima de 2500 - desconto de 20%

Imprima na tela as informações, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.

    Salário Bruto: (5 * 220)        : R$ 1100,00
    (-) IR (5%)                     : R$   55,00
    (-) INSS ( 10%)                 : R$  110,00
    FGTS (11%)                      : R$  121,00
    Total de descontos              : R$  165,00
    Salário Liquido                 : R$  935,00
 */

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu valor hora: ");
        double valor_hora = scanner.nextDouble();

        System.out.print("Digite quantas horas você trabalha por mês: ");
        double horas_mes = scanner.nextDouble();

        //Determinação do salário bruto
        double salario_bruto=valor_hora*horas_mes;

        //Descontos rigidos
        double INSS = 0.10;
        double FGTS = 0.11;
        double IR;

        //Condições para achar o desconto do imposto de renda
        if (salario_bruto<=900){
            IR=0;
        }
        else if (salario_bruto<=1500){
            IR=0.05;
        }
        else if (salario_bruto<=2500){
            IR = 0.10;
        }
        else{
            IR = 0.20;
        }

        //Descontos

        double desconto_INSS = salario_bruto*INSS;
        double desconto_FGTS = salario_bruto*FGTS;
        double desconto_IR = salario_bruto*IR;
        double salario_liquido = salario_bruto-desconto_IR-desconto_INSS;
        double total_de_descontos = desconto_INSS+desconto_IR;

        //Print das informações

        System.out.print("\nSalário Bruto: ( "+valor_hora+ " * "+horas_mes+ " ) : R$ "+salario_bruto);
        System.out.print("\n(-) IR: ( "+IR*100+"%) : R$ "+desconto_IR);
        System.out.print("\n(-) INSS: ( "+INSS*100+"%) : R$ "+desconto_INSS);
        System.out.print("\n(-) FGTS: ( "+FGTS*100+"%) : R$ "+desconto_FGTS);
        System.out.print("\nTotal de descontos: R$ "+total_de_descontos);
        System.out.print("\nSalário Líquido: R$ "+salario_liquido);

        scanner.close();

    }
}
