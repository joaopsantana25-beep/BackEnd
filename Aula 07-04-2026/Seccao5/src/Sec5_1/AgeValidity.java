package Sec5_1;

import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean drivingUnderAge = false;

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();


        if(idade<=18){
            drivingUnderAge=true;
        }

        System.out.print("drivinUnderAge: "+drivingUnderAge);
        scanner.close();
    }
}