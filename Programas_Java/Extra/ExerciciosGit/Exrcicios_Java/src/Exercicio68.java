/*
Exercicio 068
Faça um programa que calcule o mostre a média aritmética de N notas.

 */
import java.util.Scanner;

public class Exercicio68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float soma = 0;
        int numero_notas = 0;

        while (true) {
            System.out.print("Digite a nota,para sair digite (-1): ");
            float nota = scanner.nextFloat();

            if (nota == -1) {
                System.out.println("Saindo do programa");
                break;
            }

            soma += nota;
            numero_notas++;

            System.out.println("Nota Computada!");

        }

        if (numero_notas == 0) {
            System.out.println("Nenhuma nota foi digitada");
            System.out.print("Fim do Programa");
        }
        else {
            float media =soma/numero_notas;

            System.out.printf("\nA média aritmética das notas é: %.2f%n",media);
            System.out.print("Fim do Programa!");
        }
        scanner.close();
    }
}
