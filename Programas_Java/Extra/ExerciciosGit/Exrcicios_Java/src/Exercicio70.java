/*
Exercicio 070
Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores.
Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.

 */

import java.util.Scanner;

public class Exercicio70 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int votos_candidato1=0;
    int votos_candidato2=0;
    int votos_candidato3=0;

    System.out.print("Digite o número de eleitores: ");
    int numero_de_eleitores = scanner.nextInt();

    if (numero_de_eleitores == 0) {
        System.out.print("Não há nenhum eleitor, fim do programa");
    }
    else
    {
        for(int i=1;i<=numero_de_eleitores;i++){
            System.out.print("Digite o seu voto (1º candidato - 1; 2º candidato - 2; 3º candidato - 3): ");
            int voto = scanner.nextInt();

            System.out.println("Voto Computado!");

            if (voto==1){
                votos_candidato1++;
            }
            else if (voto==2){
                votos_candidato2++;
            }
            else if(voto==3){
                votos_candidato3++;
            }
        }

        System.out.print("Fim da votação\n");
        System.out.print("O primeiro candidato recebeu: "+votos_candidato1+"\n");
        System.out.print("O segundo candidato recebeu: "+votos_candidato2+"\n");
        System.out.print("O terceiro candidato recebeu: "+votos_candidato3+"\n");
    }
}
}
