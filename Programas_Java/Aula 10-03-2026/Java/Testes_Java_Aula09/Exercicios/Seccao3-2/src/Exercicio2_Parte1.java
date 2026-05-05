/*
Exercício 2, Parte 1

Copyright © 2022, Oracle e/ou suas empresas afiliadas. Oracle, Java e MySQL são marcas

comerciais registradas da Oracle Corporation e/ou de suas empresas afiliadas. Outros nomes
podem ser marcas comerciais de seus respectivos proprietários.

JFo 3-2

Dados Numéricos

#

Crie um novo projeto e adicione o arquivo

Chickens02.java a ele

Leia esta história e calcule/imprima os
valores
obrigatórios:

−Na segunda-feira, o Fazendeiro Fred recolhe 100 ovos

−Na terça-feira, ele recolhe 121 ovos

−Na quarta-feira, ele recolhe 117 ovos

−Qual é a média diária de ovos recolhidos?

−Quantos ovos poderiam ser esperados em uma
média mensal de 30 dias?

−Se um ovo pode ser vendido com um lucro de US$ 0,18, qual
é o lucro mensal total dos ovos?
 */
public class Exercicio2_Parte1 {
    public static void main(String[] args) {
        //Coloque seu código aqui
        float ovos_segunda=100;
        float ovos_terca=121;
        float ovos_quarta=117;

        float Media_diaria = (ovos_segunda+ovos_terca+ovos_quarta)/3;
        float Media_mensal = 30*Media_diaria;
        float Lucro_mensal =  Media_mensal*18/100;

        System.out.println("Média diária::   " +Media_diaria);
        System.out.println("Média Mensal: " +Media_mensal);
        System.out.println("Lucro Mensal:  $" +Lucro_mensal);
    }

}


