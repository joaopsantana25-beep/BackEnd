/*
Exercicio 021
Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino,
Sexo Inválido.
 */

import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite F ou M: ");
        String letra = scanner.nextLine();

        if (letra.equals("M")) {
            System.out.print("Você digitou 'M' de Masculino");

        } else if (letra.equals("F")) {
            System.out.print("Você digitou 'F' de Feminino");
        } else {
            System.out.print("Sexo Inválido");
        }

        scanner.close();
    }
}
