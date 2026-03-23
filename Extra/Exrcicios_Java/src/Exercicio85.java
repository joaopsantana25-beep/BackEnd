/*
Exercicio 085
Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código.
Os códigos utilizados são: 1, 2, 3, 4 - Votos para os respectivos candidatos (você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
5 - Voto Nulo 6 - Voto em Branco

Faça um programa que calcule e mostre: O total de votos para cada candidato;
O total de votos nulos;
O total de votos em branco;
A percentagem de votos nulos sobre o total de votos;
A percentagem de votos em branco sobre o total de votos.

Para finalizar o conjunto de votos tem-se o valor zero.

 */

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double candidato1=0,candidato2=0,candidato3=0,candidato4=0,nulo=0,branco=0,numero_votos=0;


    while (true){
        System.out.print("Insira o seu voto: ");
        int voto = scanner.nextInt();

        if(voto == 0){
            System.out.println("Fim da Votação");
            break;
        }

        if (voto<0 || voto>6){
            System.out.println("Voto Inválido!");
            continue;
        }

        if (voto==1){
            candidato1++;
        }
        if (voto==2){
            candidato2++;
        }
        if(voto==3){
            candidato3++;
        }
        if(voto==4){
            candidato4++;
        }
        if(voto==5){
            nulo++;
        }
        if(voto==6){
            branco++;
        }

        numero_votos++;
        System.out.println("Voto Computado!");
    }

    if (numero_votos>0){
        double porcentagem_nulos = nulo/numero_votos;
        double porcentagem_branco = branco/numero_votos;

        System.out.println("O primeiro candidato José recebeu: "+candidato1);
        System.out.println("O segundo candidato Romário recebeu: "+candidato2);
        System.out.println("O terceiro candidato João recebeu: "+candidato3);
        System.out.println("O quarto candidato Alexandre recebeu: "+candidato4);
        System.out.println("Houve "+nulo+" votos nulos e "+branco+" votos em branco");
        System.out.printf("A %.2f%% dos votos foram nulos e %.2f %% dos votos foram em branco",porcentagem_nulos*100,porcentagem_branco*100);


    }
}
}
