/*
Listas
Exercicio 092
Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

 */

import java.util.List;
import java.util.ArrayList;

public class Exercicio92 {
    public static void main(String[] args){

        List<Integer>Lista_Numeros = new ArrayList<>();

        for (int i =0;i<5;i++){
            Lista_Numeros.add(i);
        }

        for (int i = 0;i<Lista_Numeros.size();i++){
            System.out.println(Lista_Numeros.get(i));
        }

}
}
