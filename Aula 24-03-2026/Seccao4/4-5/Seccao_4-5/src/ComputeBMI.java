import java.util.Scanner;
import java.lang.Math;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Digite o seu peso em libras: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em polegadas: ");
        double altura = scanner.nextDouble();

        double IMB = peso*703/Math.pow(altura,2);

        System.out.print("O seu IMB é: "+Math.round(IMB));


    }
}