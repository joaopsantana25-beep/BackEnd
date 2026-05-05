/*
Exercicio 076
O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas,
e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio76 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int numero_de_leituras=0;
    double soma =0;

    List<Double>lista_de_temperaturas = new ArrayList<>();

    while (true){
        System.out.print("Digite a temperatura(para sair digite 'sair'): ");
        String leitura = scanner.nextLine();

        if (leitura.equals("sair")){
            System.out.print("\nSaindo...\n");
            break;
        }

        double double_leitura = Double.parseDouble(leitura);

        lista_de_temperaturas.add(double_leitura);
        numero_de_leituras++;
    }

    if(numero_de_leituras==0){
        System.out.print("\nNenhum leitura foi computada!\n");
    }
    else{
        double maior_leitura = lista_de_temperaturas.get(0);
        double menor_leitura = lista_de_temperaturas.get(0);

        for (int i = 0;i<numero_de_leituras;i++){
            soma+=lista_de_temperaturas.get(i);

            if(maior_leitura>=lista_de_temperaturas.get(i)){
                maior_leitura=maior_leitura;
            }
            else{
                maior_leitura=lista_de_temperaturas.get(i);
            }

            if(menor_leitura<=lista_de_temperaturas.get(i)){
                menor_leitura=menor_leitura;
            }
            else{
                menor_leitura=lista_de_temperaturas.get(i);
            }
        }
        double media = soma/numero_de_leituras;

        System.out.printf("\nA maior temperatura foi: %.2f °C %n",maior_leitura);
        System.out.printf("\nA menor temperatura foi: %.2f °C %n",menor_leitura);
        System.out.printf("\nA média das temperaturas foi: %.2f °C %n",media);
    }



    System.out.print("\nFim do Programa!\n");
    scanner.close();
}
}
