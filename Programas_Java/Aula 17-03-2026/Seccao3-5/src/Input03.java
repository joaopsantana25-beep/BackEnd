import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Crie o Scanner
        Scanner scanner = new Scanner(System.in);

        //Encontre e imprima a soma de três números inteiros inseridos pelo usuário
        System.out.print("Digite o primeiro número: ");
        int var1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int var2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int var3 = scanner.nextInt();

        System.out.print("A soma dos números "+var1+", "+var2+" e "+var3+" é "+(var1+var2+var3));
        //Lembre-se de fechar o Scanner
        scanner.close();

    }
}