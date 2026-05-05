/*Exercicio 057
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 O usuário deve informar de qual numero ele deseja ver a tabuada.
 A saída deve ser conforme o exemplo abaixo: Tabuada de 5: 5 X 1 = 5 5 X 2 = 10 ... 5 X 10 = 50
*/

import java.util.Scanner;
public class Exercicio57 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número que será feita a tabuada: ");
        int numero = scanner.nextInt();

        System.out.print("Tabuada de "+numero+" :\n");
        for (int i = 0; i<=10;i++){
            int resultado = numero*i;
            System.out.println(numero +" X " +i + " = " + resultado);

        }
        scanner.close();
    }
}
