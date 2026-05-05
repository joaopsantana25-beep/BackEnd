/*
3. Simula o giro de dois dados de seis lados e exibe a soma deles.
 */

import java.util.Random;



public class Item3 {
    public static void main(String[] args){
        int soma = roll();

        System.out.print("A soma dos números dos dados é: "+soma);
    }


    public static int roll(){
        Random rand= new Random();
        int dado1 =(rand.nextInt(6)+1);
        int dado2 = (rand.nextInt(6)+1);
        return dado1+dado2;
    }
}







/*
Forma mais bonita, mas sem usar métodos

public class Item3 {
    public static void main(String[] args){
        Random rand= new Random();

        int dado1 =(rand.nextInt(6)+1);
        int dado2 = (rand.nextInt(6)+1);
        int soma = dado1+dado2;

        System.out.println("O resultado do primeiro dado é: "+dado1);
        System.out.println("O resultado do segundo dado é: "+dado2);
        System.out.print("A soma dos números dos dados é: "+soma);

    }
}
*/