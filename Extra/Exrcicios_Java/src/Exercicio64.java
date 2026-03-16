/*
Exercicio 064
Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes
e limitando o fatorial a números inteiros positivos e menores que 16
 */

import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int resultado = 0;

            while (true) {
                System.out.print("Digite o número que você deseja fazer o fatorial: ");
                int numero = scanner.nextInt();

                if(numero>16){
                    System.out.println("\nO número digitado tem que ser menor ou igual a 16");
                    continue;
                }
                if(numero<0){
                    System.out.println("O número digitado é negativo, por favor digite um número maior que 0");
                    continue;
                }

                if (numero == 0) {
                    System.out.print("O fatorial de 0 é 1");

                }

                resultado = 1;
                for (int i = numero; i >= 1; i--) {
                    resultado *= i;

                }
                System.out.println("O resultado de " + numero + "! é : " + resultado);

                System.out.print("Para sair digite 'sair: ");
                scanner.nextLine();
                String input=scanner.nextLine().toLowerCase();

                if(input.equals("sair")){
                    System.out.println("Fim do Programa");
                    break;

                }
            }

            scanner.close();
    }
}


