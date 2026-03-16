import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Exercicio 063
Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.

 */

import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();
        int soma=0;
        int maior = -1;
        int menor = 1001;

        while (true) {
            System.out.print("Digite um número, para sair digite 'sair': ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("sair")){
                break;
            }
            int Intinput = Integer.parseInt(input);

            if(Intinput<=0 || Intinput>=1000){
                System.out.println("\nDigite um número que esteja entre 0 e 1000");
                continue;
            }

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