/*
Exercicio 066
Altere o programa de cálculo dos números primos, informando,
caso o número não seja primo, por quais número ele é divisível.

 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio66 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean primo = true;

        List<Integer> lista_de_divisores= new ArrayList<>();


        System.out.print("Digite um número para verificar se ele é primo: ");
        int numero = scanner.nextInt();

        if(numero<2){
            System.out.print("O número não é primo");
        }
        else if(numero==2){
            System.out.print("O número é primo");

        }
        else{
            int metade_numero=numero/2;

            for (int i=2;i<=metade_numero;i++) {
                if (numero % i == 0) {
                    primo = false;
                    lista_de_divisores.add(i);


                }
            }

            if(primo){
                System.out.print("O número é primo");
            }

            else{
                System.out.print("O número não é primo");
                lista_de_divisores.add( 0,1);
                lista_de_divisores.add(numero);
                System.out.print("\nSeus divisores são: "+ lista_de_divisores);
            }

        }

        scanner.close();
    }
}


