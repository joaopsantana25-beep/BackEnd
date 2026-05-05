
import java.util.Scanner;

public class Exercicio30_maquina {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor da sua hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        double horasMes = scanner.nextDouble();

        // Cálculo do salário bruto
        double salarioBruto = valorHora * horasMes;

        // Percentuais fixos
        double percentualINSS = 0.10;
        double percentualFGTS = 0.11;
        double percentualIR;

        // Determinação do percentual do IR
        if (salarioBruto <= 900) {
            percentualIR = 0.0;
        }
        else if (salarioBruto <= 1500) {
            percentualIR = 0.05;
        }
        else if (salarioBruto <= 2500) {
            percentualIR = 0.10;
        }
        else {
            percentualIR = 0.20;
        }

        // Cálculo dos descontos
        double descontoIR = salarioBruto * percentualIR;
        double descontoINSS = salarioBruto * percentualINSS;
        double valorFGTS = salarioBruto * percentualFGTS;

        double totalDescontos = descontoIR + descontoINSS;
        double salarioLiquido = salarioBruto - totalDescontos;

        // Saída formatada
        System.out.println("\n---- Demonstrativo de Pagamento ----");

        System.out.printf("Salário Bruto: (%.2f * %.2f) : R$ %.2f\n",
                valorHora, horasMes, salarioBruto);

        System.out.printf("(-) IR (%.0f%%)              : R$ %.2f\n",
                percentualIR * 100, descontoIR);

        System.out.printf("(-) INSS (10%%)             : R$ %.2f\n",
                descontoINSS);

        System.out.printf("FGTS (11%%)                 : R$ %.2f\n",
                valorFGTS);

        System.out.printf("Total de descontos         : R$ %.2f\n",
                totalDescontos);

        System.out.printf("Salário Líquido            : R$ %.2f\n",
                salarioLiquido);

        scanner.close();
    }
}

