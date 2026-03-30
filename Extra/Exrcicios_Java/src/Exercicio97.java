/*
Exercicio 097
Faça um Programa que peça as quatro notas de 10 alunos,
calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio97 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Double>medias = new ArrayList<>();
        int medias_maioresiguais_7=0;

        for (int i = 0;i<3;i++){
            double soma = 0;
            double media = 0;

            for (int j =0;j<4;j++){
                System.out.print("\nDigite a nota "+(j+1)+": ");
                double nota = scanner.nextDouble();

                soma+=nota;
            }

            System.out.print("Média calculada\n");
            media = soma /4;
            medias.add(media);

            if(media>=7){
                medias_maioresiguais_7++;
            }

        }

        System.out.println("\nAs médias calculadas foras: "+medias);
        System.out.println("O número de médias maiores ou iguais a 7 foram: "+medias_maioresiguais_7);

        scanner.close();
    }
}
