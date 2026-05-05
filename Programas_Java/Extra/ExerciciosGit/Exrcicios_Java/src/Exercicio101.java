/*
Exercicio 101
Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos,
cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
 */

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Exercicio101 {
    public static void main(String[] args){
        Random gerador = new Random();

        List<Integer>Vetor1 = new ArrayList<>();
        List<Integer>Vetor2 = new ArrayList<>();
        List<Integer>Vetor3 = new ArrayList<>();

        for (int i =0;i<10;i++){
            int numero1 = gerador.nextInt(1000);
            int numero2 = gerador.nextInt(1000);

            Vetor1.add(numero1);
            Vetor2.add(numero2);
        }

        for(int i = 0;i<10;i++){
            Vetor3.add(Vetor1.get(i));
            Vetor3.add(Vetor2.get(i));
        }

        System.out.print(Vetor1+"\n"+Vetor2+"\n"+Vetor3);
    }
}
