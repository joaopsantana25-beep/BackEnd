
public class Calculator4 {
    public double tax = .05;
    public double tip = .15;


    double soma = 0;

    //Inclua o custo das refeições de Alex e Forgetful em seus cálculos
    //Retorne o total após calcular
    public void findTotal(double price, String name,double extra){
        double total = (price+extra)*(1+tax+tip);


        System.out.print("\n"+name+" deve pagar: ");
        System.out.printf("%.2f",total);
        soma+=total;

    }

    public void total(){
        System.out.printf("\nO total da mesa é: %.2f",soma);
    }

    /*
    public void findNewTotal(){
        double acrescimo = valores_qnconstam/6;

        for (int i = 0;i<6;i++){
            System.out.print("\n"+nomes.get(i)+ " deve pagar: $");
            System.out.printf("%.2f",(valores.get(i)+acrescimo));
        }

        System.out.printf("\nO total da mesa é: $%.2f",soma);
    }

     */
}