/*
Exercicio 023
Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
 A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
  A mensagem "Reprovado", se a média for menor do que sete;
  A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args){
        float resultado = calculoMedia();

        System.out.printf("A sua média foi: %.2f ", resultado);

        if (resultado==10){
            System.out.println("\nAprovado com Distinção");
        }
        else if (resultado<7){
            System.out.println("\nReprovado");
        }
        else{
            System.out.println("Aprovado");
        }
    }

    public  static float calculoMedia(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a primeira nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1+nota2)/2;

        scanner.close();
        return  media;

    }
}
