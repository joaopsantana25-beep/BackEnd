/*
xercicio 032
Faça um programa que lê as duas notas parciais obtidas por um
aluno numa disciplina ao longo de um semestre, e calcule a sua média.

A atribuição de conceitos obedece à tabela abaixo:
Média de Aproveitamento Conceito
Entre 9.0 e 10.0 A
Entre 7.5 e 9.0 B
Entre 6.0 e 7.5 C
Entre 4.0 e 6.0 D
Entre 4.0 e zero E

O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e
a mensagem “APROVADO” se o conceito for A, B ou C
ou “REPROVADO” se o conceito for D ou E.
 */

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1+nota2)/2;

        String conceito = "";

        if (media<4){
            conceito = "E";
        }
        else if (media<6){
            conceito = "D";
        }
        else if (media<7.5){
            conceito = "C";
        }
        else if (media <9){
            conceito = "B";
        }
        else{
            conceito="A";
        }

        String status = "";

        if (conceito.equals("D")|| conceito.equals("E")){
            status = "Reprovado";
        }
        else{
            status = "Aprovado";
        }

        System.out.printf("A sua média é : %.2f ",media);
        System.out.print("\nO seu conceito é: "+conceito);
        System.out.print("\nVocê está: "+status);

    }
}
