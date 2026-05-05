/*
Exercicio 078
Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, a mais gordo e o mais magro,
para isto você deve fazer um programa que pergunte a cada um dos clientes da academia seu código, sua altura e seu peso.

O final da digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código.

Ao encerrar o programa também deve ser informados os códigos e valores do
lente mais alto,
do mais baixo,
do mais gordo
e do mais magro, além da média das alturas e dos pesos dos clientes.
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> codigos_dos_clientes = new ArrayList<>();
        List<Double> alturas_dos_clientes = new ArrayList<>();
        List<Double> peso_dos_clientes = new ArrayList<>();

        double soma_peso = 0;
        double soma_altura = 0;
        int clientes_verificados = 0;

        while (true) {
            System.out.print("Digite seu código: ");
            int codigo = scanner.nextInt();

            if (codigo == 0) {
                System.out.print("\nSaindo...\n");
                break;
            }

            System.out.print("Digite sua altura em metros: ");
            double altura = scanner.nextDouble();

            if (altura <= 0) {
                System.out.print("\nDigite uma altura válida!\n");
                continue;
            }

            System.out.print("Digite o seu peso: ");
            double peso = scanner.nextDouble();

            if (peso <= 0) {
                System.out.print("\nDigite um peso válido!\n");
                continue;
            }

            clientes_verificados++;

            //Adição das váriaveis peso,altura e código nas listas
            codigos_dos_clientes.add(codigo);
            alturas_dos_clientes.add(altura);
            peso_dos_clientes.add(peso);

            System.out.print("\nDados Computados\n");
            System.out.print("__________________________\n");
        }

        if (clientes_verificados == 0) {
            System.out.print("\nNenhum cliente foi computado\n");
        } else {
            double maior_altura = alturas_dos_clientes.get(0);
            double menor_altura = alturas_dos_clientes.get(0);

            double mais_pesado = peso_dos_clientes.get(0);
            double menor_peso = peso_dos_clientes.get(0);

            for (int i = 0; i < clientes_verificados; i++) {

                //Definir que é o mais pesado
                if (mais_pesado >= peso_dos_clientes.get(i)) {
                    mais_pesado = mais_pesado;
                } else {
                    mais_pesado = peso_dos_clientes.get(i);
                }

                //Definir que é o mais leve
                if (menor_peso <= peso_dos_clientes.get(i)) {
                    menor_peso = menor_peso;
                } else {
                    menor_peso = peso_dos_clientes.get(i);
                }


                //Definir que é o mais alto
                if (maior_altura >= alturas_dos_clientes.get(i)) {
                    maior_altura = maior_altura;
                } else {
                    maior_altura = alturas_dos_clientes.get(i);
                }

                //Definir que é o mais leve
                if (menor_altura <= alturas_dos_clientes.get(i)) {
                    menor_altura = menor_altura;
                } else {
                    menor_altura = alturas_dos_clientes.get(i);
                }

                //soma de totods os pesos e alturas
                soma_altura += alturas_dos_clientes.get(i);
                soma_peso += peso_dos_clientes.get(i);
            }

            //Media das alturas e pesos
            double media_altura = soma_altura / clientes_verificados;
            double media_peso = soma_peso / clientes_verificados;

            //Print dos clientes mais alto

            System.out.print("As informações do cliente mais alto são: \n");
            System.out.print("Código: " + codigos_dos_clientes.get((alturas_dos_clientes.indexOf(maior_altura))) + "\n");
            System.out.print("Altura: " + maior_altura + " m\n");
            System.out.print("Peso: " + peso_dos_clientes.get((alturas_dos_clientes.indexOf(maior_altura))) + " Kg\n");
            System.out.print("__________________________\n");


            //Print dos clientes mais baixo

            System.out.print("As informações do cliente mais baixo são: \n");
            System.out.print("Código: " + codigos_dos_clientes.get((alturas_dos_clientes.indexOf(menor_altura))) + "\n");
            System.out.print("Altura: " + menor_altura + " m\n");
            System.out.print("Peso: " + peso_dos_clientes.get((alturas_dos_clientes.indexOf(menor_altura))) + " Kg\n");
            System.out.print("__________________________\n");

            //Print do cliente mais pesado

            System.out.print("As informações do cliente mais pesado são: \n");
            System.out.print("Código: " + codigos_dos_clientes.get((peso_dos_clientes.indexOf(mais_pesado))) + "\n");
            System.out.print("Altura: " + alturas_dos_clientes.get(peso_dos_clientes.indexOf(mais_pesado)) + " m\n");
            System.out.print("Peso: " + mais_pesado + " Kg\n");
            System.out.print("__________________________\n");


            //Print do cliente mais leve

            System.out.print("As informações do cliente mais leve são: \n");
            System.out.print("Código: " + codigos_dos_clientes.get((peso_dos_clientes.indexOf(menor_peso))) + "\n");
            System.out.print("Altura: " + alturas_dos_clientes.get(peso_dos_clientes.indexOf(menor_peso)) + " m\n");
            System.out.print("Peso: " + menor_peso + " Kg\n");
            System.out.print("__________________________\n");

            //Print das Médias de Altura e peso

            System.out.printf("\nA altura média dos clientes é: %.2f m \n", media_altura);
            System.out.printf("\nO peso médio dos clientes é: %.2f Kg \n", media_peso);

        }




    System.out.print("\nFim do Programa!\n");
    scanner.close();

}
}
