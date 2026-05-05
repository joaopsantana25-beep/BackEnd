import java.util.Scanner;

public class Exercicio31_listas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] dias = {
                "Domingo",
                "Segunda",
                "Terça",
                "Quarta",
                "Quinta",
                "Sexta",
                "Sábado"
        };

        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 7) {
            System.out.println(numero + " - " + dias[numero - 1]);
        } else {
            System.out.println("Valor inválido");
        }

        scanner.close();
    }
}

