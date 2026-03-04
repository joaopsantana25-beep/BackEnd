/*
Exercicio 013
Tendo como dado de entrada a altura (h) de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
 Para homens: (72.7h) - 58
 Para mulheres: (62.1h) - 44.7
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        float h = scanner.nextFloat();

        float peso_ideal_homem = pesoIdealHomem(h);
        float peso_ideal_mulher = pesoIdealMulher(h);

        System.out.printf("\nSe você for homem o seu peso ideal é: %.2f Kg", peso_ideal_homem);
        System.out.printf("\nSe você for mulher o seu peso ideal é: %.2f Kg", peso_ideal_mulher);
        scanner.close();

    }

    public static float pesoIdealHomem(float altura){
    return (float) (72.7*altura - 58);
    }

    public static float pesoIdealMulher(float altura){
        return (float) (62.1*altura - 44.7);
    }
}

