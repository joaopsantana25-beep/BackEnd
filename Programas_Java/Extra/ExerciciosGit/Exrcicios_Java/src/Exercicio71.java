/*
Exercicio 071
Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma.
As turmas não podem ter mais de 40 alunos.
 */

import java.util.Scanner;

public class Exercicio71 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float soma=0;
        int turmas_validas=0;

        System.out.print("\nDigite o número de turmas: ");
        int numero_turmas = scanner.nextInt();

        for (int i = 0;i<numero_turmas;i++){
            System.out.print("Digite o número de alunos: ");
            int alunos=scanner.nextInt();

            if (alunos>40){
                System.out.print("\nO número de alunos por turma não pode utrapassar 40\n");
                continue;
            }
            if(alunos<0){
                System.out.print("\nColoque um valor válido!\n");
                continue;
            }



            soma+=alunos;
            turmas_validas++;
            System.out.print("\nNúmero Computado!\n");
        }

        if(turmas_validas>0){

        float media = soma/numero_turmas;
        System.out.printf("A média de alunos por turma é: %.2f",media);
        }
        else{
            System.out.print("Nenhuma turma válida foi informada!");
        }
        scanner.close();
    }
}
