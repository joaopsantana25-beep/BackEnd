/*
Exercicio 105
Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados quando for informado
 um valor igual a -1 (que não deve ser armazenado).

Após esta entrada de dados, faça: Mostre a quantidade de valores que foram lidos;
Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
Calcule e mostre a soma dos valores;
Calcule e mostre a média dos valores;
Calcule e mostre a quantidade de valores acima da média calculada;
Calcule e mostre a quantidade de valores abaixo de sete;
Encerre o programa com uma mensagem;
 */

import java.util.*;


public class Exercicio105 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

        int valores_lidos=0;
        double soma = 0;
        double media=0;
        int valoresAcimaMedia=0;
        int valoresAbaixo7=0;


        List<Double>notas = new ArrayList<>();

       while(true){
           System.out.print("Digite a nota: ");
           double nota = scanner.nextDouble();

           if(nota==-1){
               System.out.println("Fim da Aquisição das Notas");
               break;
           }

           if(nota<0||nota>10){
               System.out.println("Nota inválida.\nPor favor insira um valor válido");
               continue;
           }

           notas.add(nota);
           soma+=nota;
           valores_lidos++;

           System.out.println("Valor Computado!");
       }

       if(notas.isEmpty()){
           System.out.println("Nenhuma nota computada!");
       }

       else {
           //Calculo da média
           media = soma / notas.size();

           //Laço para descobrir quantos valores são maiores que a média calculada e os valores menores que 7
           for (double nota : notas) {
               if (nota > media) {
                   valoresAcimaMedia++;
               }
               if(nota<7){
                   valoresAbaixo7++;
               }
           }

           //Prints dos Dados
           System.out.println("Foram lidas: "+valores_lidos+" notas");
           System.out.println("Os valores lidos foram: "+notas);

           Collections.reverse(notas);
           System.out.println("Os valores lidos na ordem inversa são: ");

           for(double nota :notas){
               System.out.println(nota);
           }

           System.out.println("A soma das notas lidas é: "+soma);
           System.out.printf("A média das notas lidas é: %.2f \n",media);
           System.out.println("A quantidade de valores acima da média é: "+valoresAcimaMedia);
           System.out.println("A quantidade de valores abaixo de 7 é: "+valoresAbaixo7);
       }

       System.out.print("Fim do Programa!");
       scanner.close();
    }
}
