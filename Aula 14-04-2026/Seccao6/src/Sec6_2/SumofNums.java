package Sec6_2;

import java.util.Scanner;

public class SumofNums {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Digite um número (-1 to quit): ");
        int number = console.nextInt();

        do{
            sum = sum + number;     //movida para o topo do loop
            System.out.print("Digite um número (-1 to quit): ");
            number = console.nextInt();
        }
        while (number != -1);

        System.out.println("A soma é " + sum);

    }
}