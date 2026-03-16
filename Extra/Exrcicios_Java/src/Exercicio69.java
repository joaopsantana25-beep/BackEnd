
/*
Exercicio 069
Faça um programa que peça para n pessoas a sua idade, ao final o programa deverá verificar se a média de idade da turma
varia entre:
0 e 25,
26 e 60
e maior que 60;
e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

 */
import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero_pessoas = 0;
        float media = 0;
        float soma=0;

        while (true){
            System.out.print("Digite a idade da pessoa, para sair digite (-1): ");
            int idade = scanner.nextInt();

            if (idade==-1){
                System.out.println("\nSaindo...");
                break;
            }

            soma+=idade;
            numero_pessoas++;

        }

        if (numero_pessoas==0){
            System.out.print("\nNenhuma idade foi digitada");
            System.out.print("\nFim do Programa");
        }
        else{
            media=soma/numero_pessoas;
            String avaliacao;

            if(media<=25){
                avaliacao = "jovem";
            }
            else if(media<=60){
                avaliacao = "adulta";
            }
            else{
                avaliacao="idosa";
            }

            System.out.printf("A média das idades é %.2f",media);
            System.out.print(" e a sua turma é considerada "+avaliacao);
            System.out.print("\nFim do Programa");
        }
        scanner.close();
    }
}
