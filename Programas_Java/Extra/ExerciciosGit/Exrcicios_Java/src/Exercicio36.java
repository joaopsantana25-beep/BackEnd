/*
Exercicio 036
Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio36 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> meses_com_31_dias = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12));
    ArrayList<Integer> meses_com_30_dias = new ArrayList<>(Arrays.asList(4,6,9,11));



    System.out.print("Digite o dia: ");
    int dia = scanner.nextInt();

    System.out.print("Digite o mês: " );
    int mes = scanner.nextInt();

    System.out.print("Digite o ano: ");
    int ano = scanner.nextInt();



    if (meses_com_31_dias.contains(mes)){
        if (dia>=1 && dia <=31){
                System.out.print("A data está válida");
            }
        else{
                System.out.print("A data não é válida");}
             }

    else if(meses_com_30_dias.contains(mes)){

        if (dia>=1 && dia <=30){
                System.out.print("A data está válida");
            }
        else{
                System.out.print("A data não é válida");}

        }

    else if (mes == 2){
        if (ano%4==0){
            if (dia>=1 && dia <=29){
                System.out.print("A data está válida");
            }
            else{
                System.out.print("A data não é válida");
            }
        }
        else {
            if (dia>=1 && dia <=28){
                System.out.print("A data está válida");
            }
            else{
                System.out.print("A data não é válida");
            }

        }

        }
    else {
        System.out.print("A data não é válida");
    }

    scanner.close();

}
}
/*
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> meses31 = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12));
        ArrayList<Integer> meses30 = new ArrayList<>(Arrays.asList(4,6,9,11));

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean dataValida = false;

        if (mes < 1 || mes > 12) {
            dataValida = false;
        }
        else if (meses31.contains(mes)) {
            dataValida = dia >= 1 && dia <= 31;
        }
        else if (meses30.contains(mes)) {
            dataValida = dia >= 1 && dia <= 30;
        }
        else if (mes == 2) {

            boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

            if (bissexto) {
                dataValida = dia >= 1 && dia <= 29;
            } else {
                dataValida = dia >= 1 && dia <= 28;
            }
        }

        if (dataValida) {
            System.out.println("A data está válida");
        } else {
            System.out.println("A data não é válida");
        }

        scanner.close();
    }
}
 */