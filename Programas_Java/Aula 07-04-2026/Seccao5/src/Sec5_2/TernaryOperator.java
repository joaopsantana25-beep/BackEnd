package Sec5_2;

import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();
        /*
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("Depois se stmt, x = " + x);
        */
        // Use um operador ternário para executar a mesma lógica acima.


        x = (y/x>3) ? x+y : x*y;
        System.out.print("Depois se stmt, x = " + x );
    }
}


