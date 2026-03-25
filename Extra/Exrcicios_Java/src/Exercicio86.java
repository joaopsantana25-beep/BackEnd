/*
Exercicio 086
Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões, o programa deve perguntar ao aluno a resposta de cada questão
e ao final comparar com o gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1 ponto por resposta certa).

Após cada aluno utilizar o sistema deve ser feita uma pergunta se outro aluno vai utilizar o sistema.

Após todos os alunos terem respondido informar: Maior e Menor Acerto;
Total de Alunos que utilizaram o sistema;
A Média das Notas da Turma.
Gabarito da Prova: 01 - A 02 - B 03 - C 04 - D 05 - E 06 - E 07 - D 08 - C 09 - B 10 - A

Após concluir isto você poderia incrementar o programa permitindo que o professor digite o gabarito da prova antes dos alunos usarem o programa.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio86 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double numero_alunos=0;
        double soma =0;

        List<String>gabarito = new ArrayList<>();
        List<Integer>notas = new ArrayList<>();

        for (int i=0;i<10;i++){
            System.out.print("Digite a resposta para a pergunta "+(i+1)+": ");
            String resposta_gabarito = scanner.nextLine().toUpperCase();

            gabarito.add(resposta_gabarito);

        }

        System.out.println("Gabarito Registrado!");

        while (true){
            int nota_aluno=0;

            System.out.println("Bem vindo ao programa de correção da prova");

            for (int i=0;i<10;i++){
                System.out.print("Digite a sua resposta da pergunta "+(i+1)+": ");
                String resposta =scanner.nextLine().toUpperCase();
                System.out.print("\nResposta Computada!\n");

                if (resposta.equals(gabarito.get(i))){
                    nota_aluno++;
                }
            }

            notas.add(nota_aluno);
            numero_alunos++;
            soma+=nota_aluno;

            System.out.print("Mais algum aluno usará o programa (s/n): ");
            String opcao = scanner.nextLine().toLowerCase();

            if(opcao.equals("n")){
                System.out.print("\nFim do Programa!\n");
                break;
            }
        }
        notas.sort(null);

        //Maior nota
        int maiorNota = notas.getLast();

        //Menor nota
        int menorNota = notas.getFirst();

        //Media
        double media = soma/numero_alunos;

        System.out.println("A maior nota da sala foi: "+maiorNota);
        System.out.println("A menor nota da sala foi: "+menorNota);
        System.out.printf("A média das notas da sala foi: %.2f ",media);

        scanner.close();
    }
}
