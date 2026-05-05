/*
Exercicio 102
Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio102 {
    public static void main(String[] args){
        Random gerador = new Random();

        List<Integer> Vetor1 = new ArrayList<>();
        List<Integer>Vetor2 = new ArrayList<>();
        List<Integer>Vetor3= new ArrayList<>();
        List<Integer>Vetor4= new ArrayList<>();

        for (int i =0;i<10;i++){
            int numero1 = gerador.nextInt(10);
            int numero2 = gerador.nextInt(100);
            int numero3 = gerador.nextInt(1000);

            Vetor1.add(numero1);
            Vetor2.add(numero2);
            Vetor3.add(numero3);
        }

        for(int i = 0;i<10;i++){
            Vetor4.add(Vetor1.get(i));
            Vetor4.add(Vetor2.get(i));
            Vetor4.add(Vetor3.get(i));
        }

        System.out.print(Vetor1+"\n"+Vetor2+"\n"+Vetor3+"\n"+Vetor4);
    }
}


