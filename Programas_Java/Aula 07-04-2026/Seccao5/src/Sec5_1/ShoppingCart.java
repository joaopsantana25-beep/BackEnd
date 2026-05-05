package Sec5_1;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Maria Clara";
        String itemDesc = "Camisa";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;


        //Calcule o custo total
        total = (price*quantity)*tax;


        // Declare a variável outOfStock e inicialize-a
        boolean outOfStock = true;

        // Teste a quantidade e modifique a mensagem se a quantidade for > 1
        if(quantity>1){
            itemDesc="camisas";
        }

        String message = custName+" quer comprar "+quantity+" "+itemDesc;

        // Teste outOfStock e notifique o usuário em ambos os casos.
        if(outOfStock){
            System.out.println("Esse item não está disponível");
        }
        else{
            System.out.println(message);
            System.out.printf("$ %.2f",total);
        }
    }

}

