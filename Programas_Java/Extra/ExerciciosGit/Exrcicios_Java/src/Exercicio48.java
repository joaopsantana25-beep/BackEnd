/*
Exercicio 048
Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';

 */

import java.util.Scanner;
public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("\nDigite um nome maior que 3 caracteres: ");
            String nome = scanner.nextLine();

            System.out.print("\nDigite uma idade entre 0 e 150 anos: ");
            int idade = scanner.nextInt();

            System.out.print("\nDigite um salário mairo que 0: ");
            float salario = scanner.nextFloat();

            System.out.print("\nDigite um sexo ('f'- feminino / 'm'-para masculino): ");
            scanner.nextLine();
            String sexo = scanner.nextLine();

            System.out.print("\nDigite seu estado civil ( 's'-solteirio / 'c' - casado / 'v' - viuvo / 'd' - divorciado): ");
            String estadoCivil = scanner.nextLine();

            if (nome.length()<=3){
                System.out.print("\nNome Inválido!");
                continue;
            }
            else if (idade<0 || idade>150){
                System.out.print("\nIdade Inválida");
                continue;
            }
            else if (salario<=0){
                System.out.print("\nSalário Inválido");
                continue;
            }
            else if (!sexo.equals("f") && !sexo.equals("m")){
                System.out.print("\nSexo Inválido");
                continue;
            }
            else if (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d")){
                System.out.print("\nEstado civil inválido");
                continue;
            }
            else{
                System.out.print("\nDados válidos. Tenha um bom dia!");
                break;
            }

        }
        scanner.close();
    }
}
