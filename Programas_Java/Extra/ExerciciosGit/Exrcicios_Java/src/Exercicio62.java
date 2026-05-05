/*
Exercicio 062
Faça um programa que, dado um conjunto de N números, determine o menor valor,
o maior valor e a soma dos valores.

 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio62 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        int soma=0;
        int maior = -50000000;
        int menor = 800000000;

        while (true) {
            System.out.print("Digite um número, para sair digite 'sair': ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("sair")){
                break;
            }
            int Intinput = Integer.parseInt(input);

            if(maior>=Intinput){
                maior=maior;
            }
            else{
                maior=Intinput;
            }


            if(menor<=Intinput){
                menor=menor;
            }
            else{
                menor=Intinput;
            }

            lista.add(Intinput);
            soma+=Intinput;

        }

        System.out.println("O maior número digitado foi: "+maior);
        System.out.println("O menor número digitado foi: "+menor);
        System.out.println("A soma dos números é: "+soma);
        scanner.close();
    }
}
