/*
Exercicio 049
Supondo que a população de um país A seja da ordem de 80000 habitantes
com uma taxa anual de crescimento de 3% e que
a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.

Faça um programa que calcule e escreva o número de anos necessários para que a população do país A
ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

 */


public class Exercicio49 {
    public static void main(String[] args){
        int contador_anos=0;

        //Populacao nas cidades
        float popolacaoA = 80000;
        float populacaoB=200000;

        //Taxa de Crecimento
        double crescimentoA=0.03;
        double crescimentoB=0.015;

        while (true){
            contador_anos++;
            popolacaoA*=(1+crescimentoA);
            populacaoB*=(1+crescimentoB);

            if (popolacaoA>=populacaoB){
                break;
            }

        }
        System.out.print("Vai demorar "+contador_anos+" anos para a população da cidade A ultrapassar ou igualar a população da cidade B");



    }


}
