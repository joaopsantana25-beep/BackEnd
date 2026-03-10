/*
Exercicio 041
Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.

O resultado da operação deve ser acompanhado de uma frase que diga se o número é: par ou ímpar; positivo ou negativo; inteiro ou decimal.

 */

import java.util.Scanner;
public class Exercicio41 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.print("Digite a operação que você deseja: ");
        String operacao = scanner.nextLine();

    }

    public static float operacoes(float numero1, float numero2,String operacao){
        if (operacao=="Soma"){
            return numero1+numero2;
        }

        if (operacao=="Subtracao"){
            return numero1-numero2;
        }

        if (operacao=="Multiplicacao"){
            return numero1*numero2;
        }
        if (operacao=="Divisao"){
            return numero1/numero2;
        }
    }
}
