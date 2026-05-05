public class ShoppingCart02 {
public static void main(String[] args){
    String custName;
    String itemDesc;
    String message;


    custName="Alex";
    itemDesc="Camisa";

    message=(custName+" quer comprar uma "+ itemDesc+"\nO custo total com o imposto é: ");

    double preco;
    double imposto;
    int quantidade;
    double totalPrice;

    preco = 5;
    quantidade = 4;
    imposto = 0.289;


    totalPrice = quantidade*preco*(1+imposto);

    System.out.print(message);
    System.out.printf("$%.2f",totalPrice);



}
}
