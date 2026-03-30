import java.util.List;
import java.util.ArrayList;

public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Isso é o que todos devem antes dos impostos e gorjetas:
    public double originalPrice = 0;


    List<Double>valores = new ArrayList<>();


    public void findTotal(double price,String pessoa){

        double total = price*(1+tax+tip);
        System.out.print("\n"+pessoa+" deve pagar: ");
        System.out.printf("%.2f",total);
        //Calculate an individual's total after tax and tip
        //Print this value
        valores.add(total);
    }

    public void mostrar_total(){
        double soma = 0;

        for(int i = 0;i<valores.size();i++){
            soma+=valores.get(i);
        }

        System.out.printf("\nO valor total da mesa é: %.2f",soma);
    }

}