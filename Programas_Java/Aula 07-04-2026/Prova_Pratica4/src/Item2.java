/*
  2. Calcula o tamanho da hipotenusa de um triângulo dado o comprimento de seus lados.
 */


import java.util.Scanner;
import java.lang.Math;

public class Item2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o tamanho do primeiro cateto: ");
        double catetoA = scanner.nextDouble();


        System.out.print("Digite o tamanho do segundo cateto: ");
        double catetoB = scanner.nextDouble();

       double hipotenusa=calc_hipotenusa(catetoA,catetoB);

        System.out.printf("A hipotenusa do triângulo retângulo com catetos iguais a %.2f e %.2f é: %.2f",catetoA,catetoB,hipotenusa);
        scanner.close();
    }

    public static double calc_hipotenusa(double catetoA, double catetoB){
        return Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));
    }
}
