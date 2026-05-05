import java.util.List;
import java.util.ArrayList;

public class Calculator4_Alternativo{
    public double tax = .05;
    public double tip = .15;

    List<String>nomes = new ArrayList<>();
    List<Double>valores = new ArrayList<>();

    double valores_qnconstam = (30+15)*(1+tax+tip);
    double acrescimo = valores_qnconstam/6;
    double soma = 0;

    //Inclua o custo das refeições de Alex e Forgetful em seus cálculos
    //Retorne o total após calcular
    public void findTotal(double price, String name){
        double total = price*(1+tax+tip);
        double novo_total = total + acrescimo;

        if(name.equals("Alex") || name.equals("Forgetful")){
        }
        else{
            System.out.print("\n"+name+" deve pagar: ");
            System.out.printf("%.2f",novo_total);
            valores.add(total);
            nomes.add(name);
            soma+=novo_total;
        }


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