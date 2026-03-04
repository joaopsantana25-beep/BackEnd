/*
Exercicio 012
Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
usando a seguinte fórmula: (72.7*altura) - 58
 */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio12 {
    public static void main(String[] args){
        float peso_ideal = pesoIdeal();
        System.out.printf("O seu peso ideal é: %.1f%n",peso_ideal);

    }

    public static float pesoIdeal(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Digite sua altura em metros: ");
        float altura = scanner.nextFloat();

        scanner.close();

        return (float)((72.7*altura)-58);

    }
}
