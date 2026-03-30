/*
Exercicio 099
Faça um Programa que peça a idade e a altura de 5 pessoas,
armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio99 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Double>pesos = new ArrayList<>();
        List<Double>alturas = new ArrayList<>();

        for (int i = 0;i<5;i++){

            System.out.print("Digite o seu peso: ");
            double peso = scanner.nextDouble();
            pesos.add(peso);

            System.out.println("Peso computado!");

            System.out.print("Digite a sua altura: ");
            double altura= scanner.nextDouble();
            alturas.add(altura);

            System.out.println("Altura computada!");
        }


        System.out.print("\nOs pesos digitados foram: ");
        for (int i =0;i<5;i++){
            System.out.printf("%.2f",pesos.get(pesos.size()-i-1));

            if(i<4){
                System.out.print(", ");
            }
        }


        System.out.print("\nAs alturas digitadas foram: ");
        for (int i =0;i<5;i++){
            System.out.printf("%.2f",alturas.get(alturas.size()-i-1));


            if(i<4){
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
