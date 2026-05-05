/*
Exercicio 056
Altere o programa anterior para mostrar no final a soma dos números.

 */


import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int soma=0;

        System.out.print("Digite um número inteiro que será o começo do intervalo: ");
        int comeco_ciclo = scanner.nextInt();

        System.out.print("Digite o número inteiro que será o fim do intervalo: ");
        int final_ciclo= scanner.nextInt();

        for (int i = comeco_ciclo+1;i<final_ciclo;i++){
            System.out.println(i);
            soma+=i;

        }

        System.out.print("A soma dos números é: "+soma);
        scanner.close();

    }

}