package Sec5_1;

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num = 0;

        System.out.print("Digite um número entre 1 e 10: ");
        num = scanner.nextInt();

        System.out.print("O número é "+num);

        if(num%2==0){
            System.out.print(", par");
        }
        else{
            System.out.print(", ímpar");
        }

        scanner.close();
    }
}