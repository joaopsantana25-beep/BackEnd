package Sec6_3;

import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum=0;

        for (int i =0;i<10;i++){
            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            if(num==0){
                System.out.println("Fim da Contagem!");
                break;
            }

            sum+=num;
            System.out.println("Número Computado!");
        }

        System.out.print("A soma dos números informados é: "+sum);
        scanner.close();
    }
}