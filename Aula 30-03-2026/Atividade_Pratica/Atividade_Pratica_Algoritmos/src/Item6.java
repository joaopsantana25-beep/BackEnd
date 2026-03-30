/*
Crie um programa que lê o salário de um funcionário, reajusta o salário em 7% e
mostra o resultado.
 */

import java.util.Scanner;

public class Item6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double salario,reajuste,novoSalario;

        System.out.print("Digite o salário do funcionário: ");
        salario= scanner.nextDouble();

        reajuste = salario*0.07;

        novoSalario=salario+reajuste;

        System.out.print("O novo salário reajustado é: "+novoSalario);
        scanner.close();

    }
}
