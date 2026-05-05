/*

Exercicio 079
Um funcionário de uma empresa recebe aumento salarial anualmente.

Sabe-se que: Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.

Faça um programa que determine o salário atual desse funcionário.
Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial do funcionário.

 */

import java.util.Scanner;
import java.math.BigDecimal;

public class Exercicio79 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int ano_contratacao = 1995;
        int ano_atual = 2001;

        System.out.print("Digite o salário inicial: ");
        BigDecimal salario_inicial = scanner.nextBigDecimal();

        BigDecimal aumento = new BigDecimal("0.015");

        // 1996
        BigDecimal salario_final = salario_inicial.multiply(BigDecimal.ONE.add(aumento));

        // 1997 até 2026
        for (int i = ano_contratacao + 2; i <= ano_atual; i++) {
            aumento = aumento.multiply(new BigDecimal("2"));
            salario_final = salario_final.multiply(BigDecimal.ONE.add(aumento));
        }

        System.out.printf(
                "Salário inicial em %d: R$ %.2f%nSalário em %d: R$ %.2f",
                ano_contratacao, salario_inicial, ano_atual, salario_final
        );

        scanner.close();
    }
}