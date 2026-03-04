/*
Exercicio 014
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.

Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.

João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.

Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
*/




import java.util.Scanner;
public class Exercicio14 {
 public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);
     System.out.print("Digite o peso do peixe: ");
     float peso_peixe = scanner.nextFloat();

     float excesso = 0;
     float  multa  = 0;

     if (peso_peixe>50) {
         excesso = peso_peixe - 50;
         multa = excesso * 4;

         System.out.printf("\nO valor da multa é de: R$ %.2f reais", multa);
     }else{
         System.out.print("Não tem multa pelo peixe");

     }
     scanner.close();
}
}
