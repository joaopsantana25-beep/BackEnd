/*
Exercicio 050
Altere o programa anterior permitindo ao usuário informar as populações
e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

 */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while  (true) {
            System.out.print("\nDigite a população da cidade A: ");
            float popolacaoA = scanner.nextFloat();

            System.out.print("\nDigite a população da cidade B: ");
            float populacaoB = scanner.nextFloat();


            if(popolacaoA<=0 || populacaoB<=0 || populacaoB==popolacaoA){
                System.out.print("\nAs populações devem possuir valores positivos e distintos");
                continue;
            }

            System.out.print("\nDigite o cresimento populacional da cidade A (em porcentagem 3/4/5%): ");
            double crescimentoA = scanner.nextDouble();
            crescimentoA=(1+crescimentoA/100);


            System.out.print("\nDigite o cresimento populacional da cidade B (em porcentagem 3/4/5%): ");
            double crescimentoB = scanner.nextDouble();
            crescimentoB=(1+crescimentoB/100);

            if(crescimentoA<=0 || crescimentoB<=0 || crescimentoB==crescimentoA){
                System.out.print("\nAs populações devem possuir valores positivos e distintos");
                continue;
            }

            if ((crescimentoA>crescimentoB && crescimentoA<crescimentoB) || (crescimentoB>crescimentoA && crescimentoB<crescimentoA) ){
                System.out.print("\nA cidade com menor número populacional deve ter a maior taxa de crescimento");
                continue;
            }

            int anos = contar_anos(popolacaoA,populacaoB,crescimentoA,crescimentoB);
            System.out.print("\nVai demorar "+ anos+ " para a população ultrapassar a da outra cidade.");

            System.out.print("\nSe você deseja sair digite 'sair': ");
            scanner.nextLine();
            String opcao = scanner.nextLine().toLowerCase();

            if (opcao.equals("sair")){
                System.out.print("\nFim do Programa!");
                break;
            }
            else{
                continue;
            }

        }


    }

    public static int contar_anos(float populacaoA, float populacaoB, double taxaA, double taxaB){
        int contador_anos=0;


        while (true){
            contador_anos++;
            populacaoA*=taxaA;
            populacaoB*=taxaB;

            if (populacaoA>=populacaoB){
                break;
            }

        }
         return contador_anos;

    }

}
