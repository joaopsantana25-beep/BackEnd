/*
proprietários.

JFo 3-2

Dados Numéricos

#

Crie um novo projeto e adicione o arquivo

Chickens01.java a ele

Leia esta história e calcule/imprima o total_ovos
coletados entre segunda-feira e quarta-feira:

− As galinhas do Fazendeiro Brown sempre colocam
ovos_por_galinhas ao meio-dia, e ele recolhe no mesmo dia

− Na segunda-feira, o Fazendeiro Brown tem Contagem_de
_galinhas

− Na terça-feira de manhã, o Fazendeiro Brown ganha 1 galinha

− Na quarta-feira de manhã, um animal come
metade das galinhas!

− Quantos ovos o Fazendeiro Brown recolheu se ele começa com...

ovos_por_galinhas = 5, Contagem_de _galinhas = 3

ovos_por_galinhas = 4, Contagem_de _galinhas = 8
 */

public class Exercicio1 {
    public static void main(String[] args) {
        //Coloque seu código aqui

        int ovos_iniciais= 0;
        int ovos_por_galinha=4;
        int numero_galinhas = 8;
        int totalEggs=0;
        //Segunda feira

        totalEggs+=numero_galinhas*ovos_por_galinha+ovos_iniciais;

        //Terça Feira

        numero_galinhas+=1;
        totalEggs+=numero_galinhas*ovos_por_galinha;

        //Quarta Feira
        numero_galinhas/=2;
        totalEggs+=numero_galinhas*ovos_por_galinha;

        System.out.println(totalEggs);
    }
}