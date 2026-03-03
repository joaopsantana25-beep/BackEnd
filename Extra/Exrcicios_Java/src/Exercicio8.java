/*
Exercicio 008
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês.
 */

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digte quanto você ganha por hora: ");
        float valorHora = scanner.nextFloat();

        System.out.print("Digite quantas horas você trabalha por mês: ");
        float horasTrabalhadas = scanner.nextFloat();

        float resultado = valorHora*horasTrabalhadas;
        System.out.println("Seu salário mensal é: R$ "+resultado+" reais");

        scanner.close();
    }

}
