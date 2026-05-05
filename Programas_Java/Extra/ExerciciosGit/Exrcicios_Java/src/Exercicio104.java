/*
Exercicio 104
Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista.
Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual, e em que mês elas ocorreram
(mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).
 */

import java.util.*;

public class Exercicio104 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        double soma = 0;
        double media=0;

        List<Double>temperaturas = new ArrayList<>();
        List<String>meses= new ArrayList<>();

        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");

        for (int i =0;i<meses.size();i++){
            System.out.print("Digite a temperatura do mês "+(i+1)+": ");
            double temperatura = scanner.nextDouble();

            temperaturas.add(temperatura);

            soma+=temperatura;

            System.out.println("Temperatura Computada!");
        }

        media = soma/temperaturas.size();

        System.out.printf("A temperaturas nos seguintes meses foram maior que a media anual de %.2fºC\n",media);

        for (int i =0;i<temperaturas.size();i++){
            if(temperaturas.get(i)>media){
                System.out.printf("\n %d - %s : %.2fºC",(i+1),meses.get(i),temperaturas.get(i));
            }
        }

        scanner.close();
    }
}
