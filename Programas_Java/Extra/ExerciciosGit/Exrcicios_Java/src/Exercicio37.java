/*
Exercicio 037
Faça um Programa que leia um número inteiro maior que 0 e
menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.

Observando os termos no plural a colocação do "e", da vírgula entre outros.

Exemplo: 326 = 3 centenas, 2 dezenas e 6 unidades 12 = 1 dezena e 2 unidades

Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 */

import java.util.Scanner;
import java.util.Stack;

public class Exercicio37 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número maior que 0 e menor que 1000: ");
        int numero = scanner.nextInt();

        if (numero<=0 || numero>=1000){
            System.out.print("Digite um número válido");
        }
        else{
            int quociente100=(numero/100);
            int quociente10 = (numero%100)/10;
            int quociente1=(numero%10);

            System.out.print(numero +" = ");

            if (quociente100>1){
                System.out.print(quociente100+" centenas,");
            }
            else if (quociente100==1){
                System.out.print(quociente100+" centena,");
            }

            if (quociente10>1){
                System.out.print(quociente10+" dezenas");
            }
            else if (quociente10==1){
                System.out.print(quociente10+" dezena");
            }

            if (quociente1>1){
                System.out.print(" e " +quociente1+" unidades");
            }
            if (quociente1==1){
                System.out.print(" e " +quociente1+" unidade");
            }

        }
        scanner.close();
    }
}
