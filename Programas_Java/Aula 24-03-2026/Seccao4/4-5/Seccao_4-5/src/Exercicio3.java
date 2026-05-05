/*
Use os métodos Math.max e Math.min para
responder
às seguintes perguntas:

−Que expressão substituiria idades negativas por 0?
−Que expressão limitaria a idade máxima a 40?
 */

import java.lang.Math;
public class Exercicio3 {
    public static void main(String[] args){
        int idade = -5;

        int resultado = Math.max(idade,0);
        int resultado2 = Math.min(idade,40);

        System.out.print(resultado +" "+ resultado2);


    }
}
