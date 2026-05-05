/*
Exercicio 077
Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário,
mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo abaixo:

Montar a tabuada de: 5
Começar por: 4
Terminar em: 7

Vou montar a tabuada de 5 começando em 4 e terminando em 7:
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.

 */

import java.util.Scanner;

public class Exercicio77 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite o número que você deseja a tabuada: ");
        int numero = scanner.nextInt();

        System.out.print("Digite em qual multiplo a tabuada deve começar: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite em qual multiplo a tabuada deve terminar: ");
        int fim = scanner.nextInt();


        if(inicio>=fim){
            System.out.print("Valores inválidos, o número que começa a tabuada deve ser menor que o número que termina ela!");
        }
        else {
            System.out.print("\nVou montar a tabuada do " + numero + " começando no " + inicio + " e terminando no " + fim+"\n");
            for (int i = inicio; i <= fim; i++) {
                int produto = i * numero;

                System.out.print(numero + " x " + i + " = " + produto + "\n");

            }
        }
        System.out.print("\nFim do Programa");
        scanner.close();
    }
}
