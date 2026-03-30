/*
Exercicio 095
Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio95 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero_consoantes = 0;

        List<String>caracteres = new ArrayList<>();

        for (int i = 0;i<10;i++){
            System.out.print("\nDigite um caracter: ");
            String caracter = scanner.nextLine().toLowerCase();
            caracteres.add(caracter);
        }

        for (int i = 0;i<caracteres.size();i++){
            if(caracteres.get(i).equals("a") || caracteres.get(i).equals("e") || caracteres.get(i).equals("i") || caracteres.get(i).equals("o") || caracteres.get(i).equals("u")){
            }
            else{
                System.out.println(caracteres.get(i));
                numero_consoantes++;
            }
        }
        System.out.print("Foram lidas "+numero_consoantes+" consoantes");
        scanner.close();
    }
}
