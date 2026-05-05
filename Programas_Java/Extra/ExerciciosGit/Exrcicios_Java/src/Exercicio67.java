/*
Exercicio 067
Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário.

O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.

Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio67 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inteiro que será o limite da contagem: ");
        int limit_contagem = scanner.nextInt();

        if (limit_contagem<=2){
            System.out.print("Deve ser um número inteiro maior que 2");
        }
        else{
            List<Integer> lista_primos= new ArrayList<>();
            int numero_de_divisoes=0;

            for (int i=2;i<limit_contagem;i++){
                boolean status_primo = true;

                for(int j=2;j<i;j++){
                    numero_de_divisoes++;
                    if(i%j==0){
                        status_primo=false;
                        break;
                    }
                }

                if(status_primo){
                    lista_primos.add(i);
                }

            }
            System.out.print("O número de divisões realizadas pelo programa foi de: "+numero_de_divisoes+"\n");
            System.out.print("A lista de primos é: \n");
            System.out.print(lista_primos);
            scanner.close();


        }
    }
}
