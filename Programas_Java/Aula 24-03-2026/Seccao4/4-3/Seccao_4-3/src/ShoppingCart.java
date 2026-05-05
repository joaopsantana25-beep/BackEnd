import java.util.*;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        // Obtenha o índice do caractere de espaço (" ") em custName.

        spaceIdx=custName.indexOf(" ");
        System.out.println("O index do espaço no custaName é: "+spaceIdx);


        // Use o método substring para analisar o primeiro nome e imprimi-lo.
        firstName=custName.substring(0,spaceIdx);
        System.out.print(firstName);

    }


}