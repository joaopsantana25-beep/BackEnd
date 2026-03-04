/*
Exercicio 018
Faça um programa que peça o tamanho de um arquivo para download (em MB) e
a velocidade de um link de Internet (em Mbps), calcule e informe
o tempo aproximado de download do arquivo usando este link (em minutos).
 */

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o tamnho do arquivo em MB: ");
    double tamanho_arquivo = scanner.nextDouble();
    double tamanho_arquivo_bits=tamanho_arquivo*8;

    System.out.print("Digite a sua velocidade de internet em Mbps: ");
    double velocidade_internet = scanner.nextDouble();

    double tempo_download_segundos = tamanho_arquivo_bits/velocidade_internet;
    double tempo_download_minutos = tempo_download_segundos/60;

    System.out.printf("O tempo de download será de: %.2f min",tempo_download_minutos);

    scanner.close();

    }
}
