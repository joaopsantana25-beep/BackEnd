import java.util.*;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();

        /*
        List<String>opcoes = new ArrayList<>();

        opcoes.add("pedra");
        opcoes.add("papel");
        opcoes.add("tesoura");
        */

        int num = rand.nextInt(3);
        System.out.println("O número aleatório é " + num);
        //System.out.printf("A pessoa jogou: %s",opcoes.get(num));


    }
}