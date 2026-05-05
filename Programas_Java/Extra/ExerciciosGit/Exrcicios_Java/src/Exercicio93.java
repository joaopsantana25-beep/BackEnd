/*
Exercicio 093
Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio93 {
    public static void main(String[] args){
        List<Double>Numeros_Reais = new ArrayList<>();

        for(double i =0.1 ; i<10;i++){
            Numeros_Reais.add(i);
        }

        int length = Numeros_Reais.size();

        for (int i = 0;i<length;i++){
            System.out.println(Numeros_Reais.get(length-i-1));
        }
        Collections.reverse(Numeros_Reais);

        System.out.print(Numeros_Reais);
    }
}
