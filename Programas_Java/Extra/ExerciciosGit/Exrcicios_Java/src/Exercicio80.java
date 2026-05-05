/*
Exercicio 080
Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o número do aluno e o segundo representando a sua altura em centímetros.

Encontre o aluno mais alto e o mais baixo.

Mostre o número do aluno mais alto e o número do aluno mais baixo, junto com suas alturas.

 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio80 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int alunos_validados=0;

        List<String>nomes_dos_alunos = new ArrayList<>();
        List<Double>alturas_dos_alunos = new ArrayList<>();

        while (true){
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();


            System.out.print("Digite a sua altura em metros: ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("\nAluno Computado!\n");

            nomes_dos_alunos.add(nome);
            alturas_dos_alunos.add(altura);
            alunos_validados++;

            if (alunos_validados==10){
                break;
            }
        }

        //aluno mais alto e mais baixo

        double maior_altura = alturas_dos_alunos.getFirst();
        double menor_altura = alturas_dos_alunos.getFirst();

        for (int i =0;i<alunos_validados;i++){

            if(maior_altura>=alturas_dos_alunos.get(i))
            {
                maior_altura=maior_altura;
            }
            else
            {
                maior_altura=alturas_dos_alunos.get(i);
            }


            if(menor_altura<=alturas_dos_alunos.get(i))
            {
                menor_altura=menor_altura;
            }
            else
            {
                menor_altura=alturas_dos_alunos.get(i);
            }
        }

        //Aluno mais alto e mais baixo

        String aluno_mais_alto = nomes_dos_alunos.get(alturas_dos_alunos.indexOf(maior_altura));
        String aluno_mais_baixo= nomes_dos_alunos.get(alturas_dos_alunos.indexOf(menor_altura));

        //Print das Informações

        System.out.printf("O aluno mais alto é o %s com %.2f metros de altura.\n",aluno_mais_alto,maior_altura);
        System.out.printf("O aluno mais baixo é o %s com %.2f metros de altura.\n",aluno_mais_baixo,menor_altura);

        scanner.close();

    }
}
