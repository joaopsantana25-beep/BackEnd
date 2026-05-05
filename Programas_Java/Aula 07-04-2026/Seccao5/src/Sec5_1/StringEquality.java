package Sec5_1;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        if(nome.equals("Moe")){
            System.out.println("Você é o rei do rock and roll");
        }
        else{
            System.out.println("Você não é o rei");
        }
        scanner.close();
    }
}
