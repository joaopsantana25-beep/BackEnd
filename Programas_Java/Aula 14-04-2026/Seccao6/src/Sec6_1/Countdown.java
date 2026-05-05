package Sec6_1;

public class Countdown {

    public static void main(String[] args) {

        System.out.println("Contagem regressiva para o lançamento: ");

        for(int i = 5; i >= 0; i--) {
            System.out.print(i +" ");
        }

        System.out.println("Decolagem!");

        //-------------------------------------------------------------------
        System.out.println("Contagem regressiva para o lançamento: ");

        for(int i = 0; i <= 5; i++) {
            System.out.print(i +" ");
        }

        System.out.println("Decolagem!");

        //-------------------------------------------------------------------
        System.out.println("Contagem regressiva para o lançamento: ");

        for(int i = 0; i <= 20; i+=2) {
            System.out.print(i +" ");
        }

        System.out.println("Decolagem!");
    }
}

