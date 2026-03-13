/*
Exercicio 058
Faça um programa que peça dois números, base e expoente,
calcule e mostre o primeiro número elevado ao segundo número.
Não utilize a função de potência da linguagem.
 */

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float resultado;


        System.out.print("Digite a base: ");
        float base = scanner.nextFloat();

        System.out.print("Digite o expoente (numero natural): ");
        int expoente = scanner.nextInt();

        resultado=1;

        for (int i = 0; i<expoente;i++){
            resultado*=base;

        }


        System.out.print("O resultado de "+base+" elevado ao expoente "+expoente+" é: "+resultado);


    }
}
