/*
Exercicio 103
Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos alunos com mais de 13 anos possuem
altura inferior à média de altura desses alunos.
 */

import java.util.*;

public class Exercicio103 {
    public static void main(String[] args){
        Random gerador = new Random();

        List<Integer>idades = new ArrayList<>();
        List<Double>alturas = new ArrayList<>();

        double soma = 0;
        int alunosAbaixoMedia=0;
        int max=190;
        int min=140;
        int totalAlunos = 30;

        for (int i = 0;i<totalAlunos;i++){
            int altura_inteira = gerador.nextInt((max-min)+1)+min;
            int idade = gerador.nextInt((18-9)+1)+9;

            double altura_double = (double) altura_inteira/100;


            alturas.add(altura_double);
            idades.add(idade);
            soma+=altura_double;

        }

        double media = soma/alturas.size();

        for (int i =0;i<alturas.size();i++){
            double altura = alturas.get(i);
            int idade = idades.get(i);

            if(idade>13 && altura<media){
                alunosAbaixoMedia++;
            }
        }

        System.out.printf("A média das alturas é: %.2f \n",media);
        System.out.print("O número de alunos com mais de 13 anos e com a altura menor que a média são: "+alunosAbaixoMedia);
    }
}
