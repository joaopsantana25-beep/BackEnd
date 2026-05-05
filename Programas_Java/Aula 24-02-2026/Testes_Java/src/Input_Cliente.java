import java.util.Scanner;

public class Input_Cliente {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Prazer, " + nome + ". Como você está? Espero que bem :) !!!");
        scanner.close();
    }
}
