/*
Exercicio 042
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: "Telefonou para a vítima?" "Esteve no local do crime?" "Mora perto da vítima?" "Devia para a vítima?" "Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.

Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

 */

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Variaveis
        String classificacao;
        int contagem=0;

        String perguntas []= {
                "Telefonou para a vítima?: ",
                "Esteve no local do crime?: ",
                "Mora perto da vítima?: ",
                "Devia para a vítima?: ",
                "Já trabalhou com a vítima?: "
        };

        for (String pergunta : perguntas){
            System.out.print(pergunta);
            String resposta = scanner.nextLine();

            if (resposta.equals("S") || resposta.equals("s")){
                contagem++;
            }
        }
        if (contagem<=1){
            classificacao="Inocente";
        }
        else if(contagem==2){
            classificacao="Suspeita";
        }
        else if (contagem==5){
            classificacao="Assassino";
        }
        else{
            classificacao="Cúmplice";
        }

        System.out.print("A pessoa é: "+classificacao);
        scanner.close();
    }
}
