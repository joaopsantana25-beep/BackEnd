/*
Exercicio 031
Faça um Programa que leia um número e exiba o dia correspondente da semana.
(1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 */

import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        String dia="";

        if (numero==1){
            dia ="Domingo";
        }
        else if (numero==2){
            dia = "Segunda";
        }
        else if (numero==3){
            dia = "Terça";
        }
        else if (numero==4){
            dia = "Quarta";
        }
        else if (numero == 5){
            dia = "Quinta";
        }
        else if (numero == 6){
            dia = "Sexta";
        }
        else if (numero ==7){
            dia = "Sábado";
        }


        if (numero>0 && numero<8) {
            System.out.print(numero);
            System.out.print("-");
            System.out.print(dia);
        }
        else {
            System.out.print("\nValor inválido");
        }

    }
}

