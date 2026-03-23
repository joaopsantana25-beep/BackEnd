/*
Exercicio 081
Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.

Foram obtidos os seguintes dados:
Código da cidade;
Número de veículos de passeio (em 1999);
Número de acidentes de trânsito com vítimas (em 1999).

Deseja-se saber: Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
Qual a média de veículos nas cinco cidades juntas;
Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
 */

import java.util.Scanner;

class Cidade{
    int codigo;
    int numeroVeiculos;
    int numeroAcidentes;

    public Cidade(int codigo, int numeroVeiculos,int numeroAcidentes){
        this.codigo = codigo;
        this.numeroVeiculos=numeroVeiculos;
        this.numeroAcidentes = numeroAcidentes;
    }
    public double getIndiceAcidentes(){
        return (double) numeroAcidentes/numeroVeiculos;
    }
}

public class Exercicio81 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Cidade[] cidades = new Cidade[5];

        for (int i=0;i<5;i++){
            System.out.println("Cidade" + (i+1));

            System.out.print("Digite o código da cidade: ");
            int codigo = scanner.nextInt();

            System.out.print("Digite o número de veículos: ");
            int numeroVeiculos = scanner.nextInt();

            System.out.print("Digite o número de acidentes: ");
            int numeroAcidentes = scanner.nextInt();

            cidades[i]=new Cidade(codigo,numeroVeiculos,numeroAcidentes);
        }
        Cidade CidadeMaiorIndice = cidades[0];
        Cidade CidadeMenorIndice = cidades[0];

        int soma_veiculos = 0;

        int somaAcidentesMenor2000=0;
        int contadorMenor2000=0;

        for (int i = 0;i<5;i++){
            Cidade c = cidades[i];

            if (c.getIndiceAcidentes() > CidadeMaiorIndice.getIndiceAcidentes()) {
                CidadeMaiorIndice = c;
            }

            if (c.getIndiceAcidentes() < CidadeMenorIndice.getIndiceAcidentes()) {
                CidadeMenorIndice = c;
            }

            soma_veiculos+=c.numeroVeiculos;

            if(c.numeroVeiculos<2000){
                somaAcidentesMenor2000+=c.numeroAcidentes;
                contadorMenor2000++;
            }

        }
        // Resultados
        System.out.println("\n--- RESULTADOS ---");

        System.out.println("Maior índice de acidentes: " + CidadeMaiorIndice.getIndiceAcidentes() +
                " (Cidade código " + CidadeMaiorIndice.codigo + ")");

        System.out.println("Menor índice de acidentes: " + CidadeMenorIndice.getIndiceAcidentes() +
                " (Cidade código " + CidadeMenorIndice.codigo + ")");

        double mediaVeiculos = (double) soma_veiculos / 5;
        System.out.println("Média de veículos: " + mediaVeiculos);

        if (contadorMenor2000 > 0) {
            double mediaAcidentes = (double) somaAcidentesMenor2000 / contadorMenor2000;
            System.out.println("Média de acidentes (cidades < 2000 veículos): " + mediaAcidentes);
        } else {
            System.out.println("Nenhuma cidade com menos de 2000 veículos.");
        }

        scanner.close();

    }


}
