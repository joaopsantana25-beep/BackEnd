/*
Exercicio 028
Faça um Programa que pergunte em que turno você estuda.
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.

Imprima a mensagem "Bom Dia!",
"Boa Tarde!" ou "Boa Noite!"
 ou "Valor Inválido!", conforme o caso.
 */

import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite 'M' se você estuda de manhã,'V' se você estuda de tarde e 'N' se você estuda de noite: " );
    String resposta = scanner.nextLine();

    if (resposta.equals("M")){
        System.out.print("Bom Dia! Você estuda de manhã");
    }
    else if(resposta.equals("V")){
        System.out.print("Boa Tarde! Você estuda de tarde");
    }
    else if (resposta.equals("N")){
        System.out.print("Boa Noite! Você estuda de noite");
    }
    else{
        System.out.print("Valor inválido!");
    }
    scanner.close();
}
}