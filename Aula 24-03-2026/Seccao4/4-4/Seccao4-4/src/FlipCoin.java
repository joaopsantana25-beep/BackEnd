import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% de chance de cara, 50% de chance de coroa
        Random rand = new Random();
        String Resultado;
        double chance = rand.nextDouble();

        if(chance<0.5){
            Resultado = "Superior";
        }
        else{
            Resultado="Inferior";
        }
        System.out.println(chance);
        System.out.print(Resultado);
    }
}
