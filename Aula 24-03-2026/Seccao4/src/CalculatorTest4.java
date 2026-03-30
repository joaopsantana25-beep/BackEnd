public class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator4 calc = new Calculator4();

        //Name your friends
        calc.findTotal(10, "pessoa 1",0);
        calc.findTotal(12, "pessoa 2",0);
        calc.findTotal(9,  "pessoa 3",0);
        calc.findTotal(8,  "pessoa 4",0);
        calc.findTotal(7,  "pessoa 5",0);
        calc.findTotal(15, "Alex",0);
        calc.findTotal(11, "pessoa 7",0);
        calc.findTotal(30, "Forgetful",0);

        System.out.print("\n");
        calc.total();


        calc.findTotal(10, "pessoa 1",45.0/6);
        calc.findTotal(12, "pessoa 2",45.0/6);
        calc.findTotal(9,  "pessoa 3",45.0/6);
        calc.findTotal(8,  "pessoa 4",45.0/6);
        calc.findTotal(7,  "pessoa 5",45.0/6);
        calc.findTotal(11, "pessoa 7",45.0/6);
        //Encontre e imprima o total da tabela inteira, incluindo impostos e gorjetas
    }
}