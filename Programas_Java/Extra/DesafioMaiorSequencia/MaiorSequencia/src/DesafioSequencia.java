/*
🧠 Desafio — Maior Sequência Crescente

Você está analisando uma sequência de números gerados por um sistema e precisa identificar padrões de crescimento.

🎯 Objetivo

Dado um array de inteiros, encontre o tamanho da maior sequência contínua crescente.

Uma sequência crescente é aquela em que cada número é maior que o anterior, e os elementos precisam ser consecutivos no array.

📌 Regras
A sequência deve ser contínua (não pode “pular” elementos)
Um único número também conta como sequência de tamanho 1
Você deve retornar apenas o tamanho da maior sequência
 */

import java.util.*;

public class DesafioSequencia {
    public static void main(String[] args){
        //Variaveis
        int contadorAtual;
        int maiorSequencia;

        List<Integer> resultados = new ArrayList<>();

        //Lista de Sequencias

        List<int[]> sequencias = List.of(

                new int[]{1, 2, 3, 1, 2, 3, 4},      // esperado: 4
                new int[]{5, 4, 3, 2, 1},            // esperado: 1
                new int[]{10, 20, 30, 5, 6, 7, 8, 1},// esperado: 4
                new int[]{1, 2, 3, 4, 5},            // esperado: 5
                new int[]{2, 2, 2, 2},               // esperado: 1
                new int[]{3, 5, 7, 9, 2, 4, 6},      // esperado: 4
                new int[]{100},                      // esperado: 1
                new int[]{1, 3, 2, 4, 5, 6},         // esperado: 4
                new int[]{9, 8, 7, 6, 7, 8, 9},      // esperado: 4
                new int[]{1, 2, 1, 2, 1, 2, 3, 4}    // esperado: 4
        );



        for(int[] sequencia : sequencias){
            contadorAtual=1;
            maiorSequencia=1;

            for(int i =1; i <sequencia.length;i++){

                int numeroAtual = sequencia[i];
                int numeroPassado = sequencia[i-1];

                if(numeroAtual>numeroPassado){
                    contadorAtual++;

                }
                else{

                    contadorAtual=1;
                }

                if(maiorSequencia<contadorAtual){
                    maiorSequencia=contadorAtual;
                }
            }

            resultados.add(maiorSequencia);
        }


        System.out.print(resultados);
    }
}
