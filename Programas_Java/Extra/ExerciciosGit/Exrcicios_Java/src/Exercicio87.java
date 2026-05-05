/*
Exercicio 087
Em uma competição de salto em distância cada atleta tem direito a cinco saltos. No final da série de saltos de cada atleta,
o melhor e o pior resultados são eliminados.

O seu resultado fica sendo a média dos três valores restantes. Você deve fazer um programa que receba o nome
e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe a média dos saltos conforme a descrição acima
informada (retirar o melhor e o pior salto e depois calcular a média).

Faça uso de uma lista para armazenar os saltos.
Os saltos são informados na ordem da execução, portanto não são ordenados.
O programa deve ser encerrado quando não for informado o nome do atleta.
A saída do programa deve ser conforme o exemplo abaixo:

Atleta: Rodrigo Curvêllo

Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m

Melhor salto:  6.5 m
Pior salto: 5.3 m
Média dos demais saltos: 5.9 m

Resultado final:
Rodrigo Curvêllo: 5.9 m
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Exercicio87 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            double soma=0;
            List<Double>saltos = new ArrayList<>();


            System.out.print("Digite o nome do atleta: ");
            String nome_atleta = scanner.nextLine();

            if (nome_atleta.isEmpty()){
                System.out.println("Fim do Programa!");
                break;
            }

            for (int i = 1;i<6;i++){
                System.out.print("\nDigite o valor do salto: ");
                double valor_salto = scanner.nextDouble();
                soma+=valor_salto;

                saltos.add(valor_salto);
                System.out.println("Salto registrado com Sucesso!");
            }



            System.out.println("Atleta: "+nome_atleta+"\n");
            System.out.println("Primeiro Salto: "+saltos.get(0)+" m");
            System.out.println("Segundo Salto: "+saltos.get(1)+" m");
            System.out.println("Terceiro Salto: "+saltos.get(2)+"m");
            System.out.println("Quarto Salto: "+saltos.get(3)+" m");
            System.out.println("Quinto Salto: "+saltos.get(4)+" m");

            saltos.sort(null);

            double melhorSalto = saltos.getLast();
            double piorSalto = saltos.getFirst();

            //Media
            double media = (soma-melhorSalto-piorSalto)/3;

            System.out.println("\nMaior salto: "+melhorSalto+" m");
            System.out.println("Pior salto: "+piorSalto+" m");
            System.out.printf("Media dos demais saltos: %.1f m\n",media);

            System.out.printf("\nResultado Final:\n%s: %.1f m\n",nome_atleta,media);
            scanner.nextLine();


        }
        scanner.close();

    }
}
