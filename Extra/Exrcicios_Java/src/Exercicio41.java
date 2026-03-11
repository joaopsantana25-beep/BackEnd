/*
Exercicio 041
Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.

O resultado da operação deve ser acompanhado de uma frase que diga se o número é: par ou ímpar; positivo ou negativo; inteiro ou decimal.

 */

import java.util.Scanner;
public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String par_impar="O número é ímpar";
        String positivo_negativo="O número é negativo";
        String inteiro_decimal="O número é decimal";

        System.out.print("Digite a operação que você deseja: ");
        String operacao = scanner.nextLine();

        System.out.print("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float num2 = scanner.nextFloat();



        if (operacao.equals("Soma") || operacao.equals("Subtracao") || operacao.equals("Multiplicacao") ||operacao.equals("Divisao")) {

            float resultado = operacoes(num1, num2, operacao);
            int intResultado = (int) resultado;

            //Mudanças nos prints
            if (resultado >= 0) {
                positivo_negativo = "O número é positivo";

            }
            if (intResultado == resultado) {
                inteiro_decimal = "O número é inteiro";

                if (resultado % 2 == 0) {
                    par_impar = "O resultado é par";
                }
            }
            else{
                par_impar="Como o número é um decimal ele não é par nem ímpar";
            }



            //Prints
            System.out.println("/n O resultado da operação é: " + resultado);
            System.out.println(par_impar);
            System.out.println(positivo_negativo);
            System.out.println(inteiro_decimal);
        }
        else{
            System.out.print("Operação inválida!");
        }

        scanner.close();



    }

    public static float operacoes(float numero1, float numero2, String operacao) {
        float resultado=0;

        if (operacao.equals("Soma")) {
            resultado=numero1 + numero2;
        }
        if (operacao.equals("Subtracao")) {
            resultado=numero1 - numero2;
        }
        if (operacao.equals("Multiplicacao")) {
            resultado=numero1 * numero2;
        }
        if (operacao.equals("Divisao")) {
            resultado=numero1 / numero2;
        }

        return resultado;
    }
}
