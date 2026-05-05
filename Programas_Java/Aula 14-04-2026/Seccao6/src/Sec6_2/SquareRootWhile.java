package Sec6_2;

import java.util.Scanner;
import java.lang.Math;

public class SquareRootWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sqrt=0;

            System.out.print("Digite um número inteiro não negativo: ");
            int number = scanner.nextInt();

            while(number<0){
                System.out.print(number + " É inválido. Tente novamente: ");
                number = scanner.nextInt();
            }

            sqrt=Math.sqrt((double) number);
            System.out.printf("A raíz quadrada de %d é: %.5f",number,sqrt);

        scanner.close();
    }
}