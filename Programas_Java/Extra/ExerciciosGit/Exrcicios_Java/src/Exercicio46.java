/*
Estruturas de repetição
Exercicio 046
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

 */

import java.util.Scanner;
public class Exercicio46 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("\nDigite uma nota entre 0 e 10: ");
            float nota = scanner.nextFloat();

            if (nota<0 || nota>10){
                System.out.print("\nNota Inválida");
            }
            else{
                System.out.print("\nVocê digitou a nota: "+nota);
                System.out.print("\nFim do Programa");
                break;
            }

        }

        scanner.close();
    }
}
