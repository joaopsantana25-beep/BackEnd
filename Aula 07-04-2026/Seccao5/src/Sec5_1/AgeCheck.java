package Sec5_1;

import java.util.Scanner;
public class AgeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade:  ");
        int myAge = scanner.nextInt();   // I am 19; let me see if I can drive yet

        if (myAge >= 18) {
            System.out.println("Eu já tenho idade para tirar a carta de motorista");
        }
        else{
            System.out.println("Eu não tenho idade ...:*(");
        }
        scanner.close();
    }
}

