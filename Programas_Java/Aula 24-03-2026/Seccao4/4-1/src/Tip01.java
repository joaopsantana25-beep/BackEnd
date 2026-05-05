import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Tip01 {
    public static void main(String[] args){

        List<Double>divida = Arrays.asList(10.0,12.0,9.0,8.0,7.0,15.0,11.0,30.0);

        double imposto = 0.05;
        double gorjeta = 0.15;

        //Encontre o total individual de cada um após impostos (5%) e gorjeta (15%)
        for (int i =0;i<divida.size();i++){
            double valor = divida.get(i)*(1+imposto+gorjeta);
            System.out.printf("Pessoa%d: $%.2f \n",(i+1),valor);
        }

        /*Isso é o que todos devem antes dos impostos e gorjetas:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */

    }
}