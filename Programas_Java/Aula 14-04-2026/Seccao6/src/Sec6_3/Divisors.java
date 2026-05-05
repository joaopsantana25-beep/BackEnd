package Sec6_3;

import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Digite o número:  ");
        int num = scanner.nextInt();

        System.out.print("Divisores de " + num+" "+ "="+" " );

        //Se o número for diferente de 0 ele faz
        if(num!=0) {

            //Pra cada valor começando do 1 até o número digitado vai dividir o número original digitado
            //Usamos a variavel i para o comando do loop for
            for (int i = 1; i < num; i++) {

                if (num % i != 0) {
                    continue;
                    //Se o resto da divisão do número por i não for 0 ele não é um divisor
                    //e o programa testa o próxim valor de i
                }

                //Se o resto da divisão for 0 o valor de i será printado na tela
                System.out.print(i + " , ");
            }
            //Para finalizar incluimos o próprio número na lista de divisores
            System.out.print(num);
        }

        //Se o número digitado for 0 será printando que todos os números diferentes de 0 conseguem dividir ele
        else{
            System.out.print("Todos os números dividem o zero, exceto o próprio 0");
        }

        scanner.close();//Fechamento do Scanner;
    }
}