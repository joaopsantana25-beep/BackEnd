/*
Exercicio 109
As Organizações Tabajara resolveram dar um abono aos seus colaboradores em reconhecimento ao bom resultado alcançado
durante o ano que passou. Para isto contratou você para desenvolver a aplicação que servirá como uma projeção de
quanto será gasto com o pagamento deste abono.
Após reuniões envolvendo a diretoria executiva, a diretoria financeira e os representantes do sindicato laboral,
chegou-se a seguinte forma de cálculo:

Cada funcionário receberá o equivalente a 20% do seu salário bruto dedezembro;

O piso do abono será de 100 reais, isto é, aqueles funcionários cujo salário for muito baixo recebem este valor mínimo;

Neste momento, não se deve ter nenhuma preocupação com colaboradores com tempo menor de casa,
descontos,
impostos ou
outras particularidades.

Seu programa deverá permitir a digitação do salário de um número indefinido (desconhecido) de salários.
Um valor de salário igual a 0 (zero) encerra a digitação.
Após a entrada de todos os dados o programa deverá calcular o valor do abono concedido a cada colaborador,
de acordo com a regra definida acima.

Ao final, o programa deverá apresentar:
O salário de cada funcionário, juntamente com o valor do abono;
O número total de funcionários processados;
O valor total a ser gasto com o pagamento do abono;
O número de funcionários que receberão o valor mínimo de 100 reais;
O maior valor pago como abono;
 */

import java.util.*;

public class Exercicio109 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double maiorAbono=0;
        double salario=0;
        double abono = 0;
        double totalGasto=0;
        int numeroAbonos100 = 0;
        int numeroFuncionarios = 0;

        List<Double>salarios = new ArrayList<>();
        List<Double>abonos = new ArrayList<>();

        while(true) {
            System.out.print("Digite o salário: ");
            salario = scanner.nextDouble();

            if (salario == 0) {
                System.out.println("Fim da Inserção de Dados");
                break;
            }

            if (salario < 0) {
                System.out.println("Valor Inválido!");
                continue;
            }

            salarios.add(salario);
            numeroFuncionarios++;
            System.out.println("Valor Computado");
        }

        if (numeroFuncionarios==0){
            System.out.println("Nenhum salário foi computado!");
        }
        else{
            for (double valor : salarios) {
                abono = valor * 0.20;

                if (abono <= 100) {
                    abono = 100;
                    numeroAbonos100++;
                }

                if (abono > maiorAbono) {
                    maiorAbono = abono;
                }

                abonos.add(abono);
                totalGasto += abono;
            }

            System.out.println("\nO salário de cada funcionário é: ");

            for(int i =0;i<salarios.size();i++){
                salario = salarios.get(i);
                abono = abonos.get(i);
                double soma = salario + abono;
                System.out.printf("%.2f + %.2f = R$ %.2f \n",salario,abono,soma);
            }

            System.out.println("\nO número total de funcionários processados foi de: "+numeroFuncionarios);
            System.out.printf("O valor total gasto com abonos foi de: R$ %.2f \n",totalGasto);
            System.out.println("O número de funcionários que receberam o valor mínimo de R$ 100,00 foi de: "+numeroAbonos100);
            System.out.printf("O maior valor gasto com abonos foi de: R$ %.2f \n",maiorAbono);

        }
        System.out.print("Fim do Programa!");
        scanner.close();
    }
}
