/*
Exercicio 108
Uma empresa de pesquisas precisa tabular os resultados da seguinte enquete feita a um grande quantidade de organizações:
"Qual o melhor Sistema Operacional para uso em servidores?"

As possíveis respostas são:

1- Windows Server 2- Unix 3- Linux 4- Netware 5- Mac OS 6- Outro

Você foi contratado para desenvolver um programa que leia o resultado da enquete e informe ao final o resultado da mesma.
O programa deverá ler os valores até ser informado o valor 0, que encerra a entrada dos dados.
Não deverão ser aceitos valores além dos válidos para o programa (0 a 6).
Os valores referentes a cada uma das opções devem ser armazenados num vetor.
Após os dados terem sido completamente informados, o programa deverá calcular a percentual de cada um dos concorrentes e informar o vencedor da enquete.
O formato da saída foi dado pela empresa, e é o seguinte:


Sistema Operacional Votos %

Windows Server 1500 17%
Unix 3500 40%
Linux 3000 34%
Netware 500 5%
Mac OS 150 2%
Outro 150 2%

Total 8800
O Sistema Operacional mais votado foi o Unix, com 3500 votos, correspondendo a 40% dos votos.

 */

import java.util.*;
public class Exercicio108 {
    public static void main(String[] args){
        Random rand = new Random();//Teste com inúmeros valores;
        Scanner scanner = new Scanner(System.in);

        int[] votos = new int[6];

        List<String>sistemas = new ArrayList<>();
        sistemas.add("Windowns Server");
        sistemas.add("Unix");
        sistemas.add("Linux");
        sistemas.add("Netware");
        sistemas.add("Mac OS");
        sistemas.add("Outros");

        int numero_votos=0;
        int maiorVoto=0;
        int indiceCampeao = 0;
        double percentualCampeao=0;

        //while(true){

            //System.out.print("Digite o seu voto: ");

       while(true){
            int voto = scanner.nextInt();

            if (voto == 0 ){
                System.out.println("Fim da Votação!");
                break;
            }

            if(voto<0 || voto>6){
                System.out.println("Valor inválido! Digite um valor de 0 a 6");
                continue;
            }


            System.out.println("Voto Computado!");
            votos[voto-1]++;
            numero_votos++;
        }

        if(numero_votos==0){
            System.out.println("\nNenhum voto foi computado!");
        }
        else {
            System.out.println("\nResultado da votação!");

            for (int i = 0; i < votos.length; i++) {
                int votos_sistema = votos[i];
                double percentual = (double) votos_sistema*100 / numero_votos;

                System.out.printf("%s %d %.0f%% \n", sistemas.get(i), votos_sistema, percentual);

                if (votos_sistema > maiorVoto) {
                    maiorVoto = votos_sistema;
                    indiceCampeao = i;
                    percentualCampeao = percentual;
                }
            }

            System.out.printf("O Sistema Operacional mais votado foi %s, com %d votos, correspondendo a %.0f%% dos votos.\n", sistemas.get(indiceCampeao), maiorVoto, percentualCampeao);
        }
        System.out.print("Fim do Programa!");
        scanner.close();
    }
}


/*
Versão com ínumeros votos trazidos de forma aleatória

import java.util.*;
public class Exercicio108 {
    public static void main(String[] args){
        Random rand = new Random();//Teste com inúmeros valores;
        Scanner scanner = new Scanner(System.in);

        int[] votos = new int[6];

        List<String>sistemas = new ArrayList<>();
        sistemas.add("Windowns Server");
        sistemas.add("Unix");
        sistemas.add("Linux");
        sistemas.add("Netware");
        sistemas.add("Mac OS");
        sistemas.add("Outros");

        int numero_votos=0;
        int maiorVoto=0;
        int indiceCampeao = 0;
        double percentualCampeao=0;

        //while(true){

            //System.out.print("Digite o seu voto: ");

        for(int i =0;i<100;i++){
            //int voto = scanner.nextInt();
            int voto = (rand.nextInt(6)+1);

            votos[voto-1]++;
            umero_votos++;
        }

        if(numero_votos==0){
        System.out.println("\nNenhum voto foi computado!");
        }

        else {
                System.out.println("\nResultado da votação!");

            for (int i = 0; i < votos.length; i++) {
                int votos_sistema = votos[i];
                double percentual = (double) votos_sistema*100 / numero_votos;

                System.out.printf("%s %d %.0f%% \n", sistemas.get(i), votos_sistema, percentual);

                if (votos_sistema > maiorVoto) {
                    maiorVoto = votos_sistema;
                    indiceCampeao = i;
                    percentualCampeao = percentual;
                    }
              }

             System.out.printf("O Sistema Operacional mais votado foi %s, com %d votos, correspondendo a %.0f%% dos votos.\n", sistemas.get(indiceCampeao), maiorVoto, percentualCampeao);
        }

        System.out.print("Fim do Programa!");
        scanner.close();
    }
 }
 */