/*
Exercicio 060
A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
Faça um programa capaz de gerar a série até o n−ésimo termo.
 */

import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite até que termo voce deseja que sea feita a sequência de Fibo.: ");
        int n_esimo = scanner.nextInt();
        int a =0;
        int b=1;



        System.out.println(1);
        for (int i = 1;i<n_esimo;i++){
            System.out.println(a+b);
            b=a+b;
            a=b-a;

        }

        scanner.close();
    }
}
