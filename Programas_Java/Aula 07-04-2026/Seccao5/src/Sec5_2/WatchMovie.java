package Sec5_2;

import java.util.Scanner;

public class WatchMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do ingresso do filme: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a classificação do filme(0 a 5): ");
        int classificacao = scanner.nextInt();

        if(preco>=12 && classificacao==5){
            System.out.print("Estou interessado em assistir o filme");
        }
        else{
            System.out.print("Não estou interessado em assisitr o filme.");
        }
        scanner.close();
    }
}

