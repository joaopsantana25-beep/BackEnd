/*
Exercicio 107
Uma grande emissora de televisão quer fazer uma enquete entre os seus telespectadores para saber qual o melhor jogador após cada jogo.
Para isto, faz-se necessário o desenvolvimento de um programa, que será utilizado pelas telefonistas, para a computação dos votos.
Sua equipe foi contratada para desenvolver este programa. Para computar cada voto, a telefonista digitará um número, entre 1 e 23, correspondente ao número da camisa do jogador.
Um número de jogador igual zero, indica que a votação foi encerrada.
Se um número inválido for digitado, o programa deve ignorá-lo, mostrando uma breve mensagem de aviso, e voltando a pedir outro número.
Após o final da votação, o programa deverá exibir:
O total de votos computados;
Os númeos e respectivos votos de todos os jogadores que receberam votos;
O percentual de votos de cada um destes jogadores;
O número do jogador escolhido como o melhor jogador da partida, juntamente com o número de votos e o percentual de votos dados a ele.
Observe que os votos inválidos e o zero final não devem ser computados como votos.
O resultado aparece ordenado pelo número do jogador. O programa deve fazer uso de arrays.
O programa deverá executar o cálculo do percentual de cada jogador através de uma função.
Esta função receberá dois parâmetros: o número de votos de um jogador e o total de votos.
A função calculará o percentual e retornará o valor calculado.

Exemplo: Enquete: Quem foi o melhor jogador?

Número do jogador (0=fim): 9 Número do jogador (0=fim): 10 Número do jogador (0=fim): 9 Número do jogador (0=fim): 10 Número do jogador (0=fim): 11 Número do jogador (0=fim):
10 Número do jogador (0=fim): 50 Informe um valor entre 1 e 23 ou 0 para sair! Número do jogador (0=fim): 9 Número do jogador (0=fim): 9 Número do jogador (0=fim): 0

Resultado da votação:

Foram computados 8 votos.

Jogador
Votos % 9 4 50,0% 10 3 37,5% 11 1 12,5%
O melhor jogador foi o número 9, com 4 votos, correspondendo a 50% do total de votos.
 */

import java.util.*;
import java.lang.Math;

public class Exercicio107 {

    public static double porcentagemVotos(double numeroVotosJogador,double numeroVotosTotais){
        double porcentagem = (100*numeroVotosJogador/numeroVotosTotais);

        return porcentagem;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeroVotos=0;
        int maiorNumeroVotos = 0;
        double melhorPercentual = 0;

        List<Integer>votosJogadores = new ArrayList<>();

        for(int i= 0;i<23;i++){
            votosJogadores.add(0);
        }

        while(true){
            System.out.print("Digite o número da camisa do jogador que foi o melhor em campo: ");
            int numeroCamisa = scanner.nextInt();

            if (numeroCamisa==0){
                System.out.println("Fim da votação!");
                break;
            }

            if(numeroCamisa<0 || numeroCamisa>23){
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair");
                continue;
            }
            int posicaoLista = numeroCamisa-1;

            votosJogadores.set((posicaoLista),(votosJogadores.get(posicaoLista)+1));
            System.out.println("Voto computado!");
            numeroVotos++;
        }

        if(numeroVotos==0){
            System.out.println("Nenhum voto foi computado.");
        }
        else{
            System.out.println("\nResultado da Votação: ");
            System.out.println("\nForam computados "+numeroVotos+" votos\n");
            for(int i =0;i<votosJogadores.size();i++){
                int jogadorVotos = votosJogadores.get(i);



                if (jogadorVotos>0){
                    double percentual = porcentagemVotos(jogadorVotos,numeroVotos);

                    if(jogadorVotos>=maiorNumeroVotos){
                        maiorNumeroVotos=jogadorVotos;
                    }

                    if(percentual>=melhorPercentual){
                        melhorPercentual=percentual;
                    }

                    System.out.printf("O jogador %d recebeu %d votos e seu percentual é %.1f%% \n",(i+1),jogadorVotos,percentual);
                }
            }

            int indexMelhorJogador = votosJogadores.indexOf(maiorNumeroVotos);
            System.out.printf("O melhor jogador foi o número %d, com %d votos, correspondendo a %.1f%% do total de votos.",(indexMelhorJogador+1),votosJogadores.get(indexMelhorJogador),melhorPercentual);
        }
        System.out.print("\nFim do Programa!");
    }


}
/*
import java.util.*;

public class Exercicio107 {

    public static double porcentagemVotos(double votosJogador, double totalVotos) {
        return (votosJogador * 100) / totalVotos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVotos = 0;
        int maiorNumeroVotos = 0;
        int melhorJogador = -1;

        int[] votos = new int[23]; // índice 0 = jogador 1

        System.out.println("Enquete: Quem foi o melhor jogador?");

        while (true) {
            System.out.print("Número do jogador (0=fim): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero < 1 || numero > 23) {
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
                continue;
            }

            votos[numero - 1]++;
            totalVotos++;
        }

        if (totalVotos == 0) {
            System.out.println("\nNenhum voto foi computado.");
            return;
        }

        System.out.println("\nResultado da votação:\n");
        System.out.println("Foram computados " + totalVotos + " votos.\n");

        System.out.printf("%-10s %-10s %-10s\n", "Jogador", "Votos", "%");

        for (int i = 0; i < votos.length; i++) {
            if (votos[i] > 0) {
                double percentual = porcentagemVotos(votos[i], totalVotos);

                System.out.printf("%-10d %-10d %-10.1f%%\n", (i + 1), votos[i], percentual);

                if (votos[i] > maiorNumeroVotos) {
                    maiorNumeroVotos = votos[i];
                    melhorJogador = i;
                }
            }
        }

        double melhorPercentual = porcentagemVotos(maiorNumeroVotos, totalVotos);

        System.out.printf(
            "\nO melhor jogador foi o número %d, com %d votos, correspondendo a %.1f%% do total de votos.\n",
            (melhorJogador + 1),
            maiorNumeroVotos,
            melhorPercentual
        );
    }
}
 */