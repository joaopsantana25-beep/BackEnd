import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Exercicio 088
Em uma competição de ginástica, cada atleta recebe votos de sete jurados.
A melhor e a pior nota são eliminadas. A sua nota fica sendo a média dos votos restantes.

Você deve fazer um programa que receba o nome do ginasta e as notas dos
sete jurados alcançadas pelo atleta em sua apresentação e depois informe a sua média,
conforme a descrição acima informada (retirar o melhor
e o pior salto e depois calcular a média com as notas restantes).

As notas não são informados ordenadas. Um exemplo de saída do programa deve ser conforme o exemplo abaixo:

 Atleta: Aparecido Parente Nota: 9.9 Nota: 7.5 Nota: 9.5 Nota: 8.5 Nota: 9.0 Nota: 8.5 Nota: 9.7

Resultado final:
Atleta: Aparecido Parente
Melhor nota: 9.9
Pior nota: 7.5
Média: 9,04

 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio88 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            
                double soma=0;
                List<Double> notas = new ArrayList<>();


                System.out.print("Digite o nome do atleta: ");
                String nome_atleta = scanner.nextLine();

          
                for (int i = 0;i<7;i++){
                    System.out.print("\nDigite o valor da nota "+(i+1)+": ");
                    double valor_nota = scanner.nextDouble();
                    soma+=valor_nota;

                    notas.add(valor_nota);
                    System.out.println("Nota registrada com Sucesso!");
                }


                System.out.println("Atleta: "+nome_atleta+"\n");

                for (int i =0;i<7;i++){
                    System.out.println("Nota: "+notas.get(i));
                }

                notas.sort(null);

                double melhorNota = notas.getLast();
                double piorNota = notas.getFirst();

                //Media
                double media = (soma-melhorNota-piorNota)/5;


                System.out.print("\nResultado Final: \n");
                System.out.println("Atleta: "+nome_atleta+"\n");

                System.out.println("Melhor nota: "+melhorNota);
                System.out.println("Pior nota: "+piorNota);
                System.out.printf("Media: %.2f \n",media);


                scanner.close();


            }
     

        }
    


