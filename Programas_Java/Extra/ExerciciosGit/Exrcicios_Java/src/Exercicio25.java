/*
Exercicio 025
Faça um Programa que leia três números e mostre o maior e o menor deles.
 */
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println("O maior número é o "+num1);

        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("O maior número é o "+num2);
        }
        else{
            System.out.println("O maior número é o "+num3);
        }
        if(num1<=num2 && num1<=num3){
            System.out.println("O menor número é o "+num1);

        }
        else if(num2<=num1 && num2<=num3){
            System.out.println("O menor número é o "+num2);
        }
        else{
            System.out.println("O menor número é o "+num3);
        }

   scanner.close();
    }
}
