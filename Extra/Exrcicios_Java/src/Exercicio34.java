/*
Exercicio 034
Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax² + bx + c.

O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:

Se o usuário informar o valor de A igual a zero, a equação não é do segundo
    grau e o programa não deve fazer pedir os demais valores,
    sendo encerrado;
Se o delta calculado for negativo, a equação não possui raízes reais.
    Informe ao usuário e encerre o programa;
Se o delta calculado for igual a zero a equação possui apenas uma raiz
    real; informe-a ao usuário;
Se o delta for positivo, a equação possui duas raiz reais;
    informe-as ao usuário;
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio34 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    double raiz1 = 0;
    double raiz2=0;



    System.out.print("Digite o coeficiente de a: ");
    double coeficiente_a = scanner.nextDouble();

    System.out.print("Digite o coeficiente de b: ");
    double coeficiente_b = scanner.nextDouble();

    System.out.print("Digite o coeficiente de c: ");
    double coeficiente_c = scanner.nextDouble();

    scanner.close();

    float delta = delta(coeficiente_a,coeficiente_b,coeficiente_c);


    if (coeficiente_a==0){
        System.out.print("Como o valor do coeficiente a é 0 a função não é de segundo grau");
    }
    else{

        if (delta<0){
            System.out.print("O valor de delta é negativo, logo a função não possui raizes reais");
        }
        if (delta==0){
            raiz1 = (-coeficiente_b/2*coeficiente_a);

            System.out.println("O valor de delta é 0, então a função possui apenas uma raíz real");
            System.out.println("Sua raíz é: "+raiz1);
        }
        if (delta>0){
            raiz1 = (-coeficiente_b + Math.sqrt(delta))/2*coeficiente_a;

            raiz2 = (-coeficiente_b - Math.sqrt(delta))/2*coeficiente_a;

            System.out.println("O valor de delta é maior que 0, logo a função possui duas raízes reais");
            System.out.println("Suas raízes são: "+raiz1+" , "+raiz2);

        }
    }
    }



    public static float delta(double a, double b, double c){
        float status = 0;
        double delta = (b*b - 4*a*c) ;

        return (float) delta;
        }


}
