public class Parsing01 {
    public static void main(String[] args){
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";

        int var1 = Integer.parseInt(shirtPrice);
        double var2 = Double.parseDouble(taxRate);
        //int var3 = Integer.parseInt(gibberish);

        double imposto = var1*var2;
        System.out.print(imposto);
    }
}
