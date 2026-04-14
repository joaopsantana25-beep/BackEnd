package Sec5_2;

import java.util.Scanner;
public class ComputeFare {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int age = scanner.nextInt();
        int fare;

        if(age<=11){
            fare = 3;
        }
        else if(age<65){
            fare = 5;
        }
        else{
            fare=3;
        }

        System.out.print(fare);
        scanner.close();

    }
}