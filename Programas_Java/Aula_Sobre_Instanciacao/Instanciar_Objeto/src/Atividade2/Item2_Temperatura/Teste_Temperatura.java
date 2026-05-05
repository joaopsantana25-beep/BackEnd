package Atividade2.Item2_Temperatura;

public class Teste_Temperatura {
    public static void main(String[] args){
        Termostato quarto = new Termostato("quarto",22);
        Termostato sala = new Termostato("sala",25);

        String comodoMaisQuente=comodoMaisQuente(quarto,sala);

        System.out.println("O cômodo mais quente é: "+comodoMaisQuente);


    }

    public static String comodoMaisQuente(Termostato comodo1,Termostato comodo2){
        double temperatura1 = comodo1.getTemperatura();
        double temperatura2 = comodo2.getTemperatura();

        if(temperatura1>=temperatura2){
            return comodo1.getComodo();
        }
        else{
            return comodo2.getComodo();
        }
    }
}
