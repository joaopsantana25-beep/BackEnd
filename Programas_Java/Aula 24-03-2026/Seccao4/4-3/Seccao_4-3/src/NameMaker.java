import java.util.*;

public class NameMaker {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String firstName,middleName,lastName,fullName;

        System.out.print("Digite o seu primeiro nome: ");
        firstName = scanner.nextLine();

        System.out.print("Digite o seu nome do meio: ");
        middleName = scanner.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        lastName = scanner.nextLine();

        fullName = (firstName+" "+middleName+" "+lastName);
        System.out.print(fullName);
    }

}