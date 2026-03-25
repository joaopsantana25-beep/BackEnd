
public class CalculatorTest2 {
    public static void main(String[] args) {
        //Instanciar um objeto Calculator2
        Calculator2 calc = new Calculator2();

        calc.originalPrice=10.00;
        System.out.println("Pessoa 1: $");
        calc.findTotal();

        calc.originalPrice=12.00;
        System.out.println("Pessoa 2: $");
        calc.findTotal();

        calc.originalPrice=9.00;
        System.out.println("Pessoa 3: $");
        calc.findTotal();

        calc.originalPrice=8.00;
        System.out.println("Pessoa 4: $");
        calc.findTotal();

        calc.originalPrice=7.00;
        System.out.println("Pessoa 5: $");
        calc.findTotal();

        calc.originalPrice=15.00;
        System.out.println("Pessoa 6: $");
        calc.findTotal();

        calc.originalPrice=11.00;
        System.out.println("Pessoa 7: $");
        calc.findTotal();

        calc.originalPrice=30.00;
        System.out.println("Pessoa 8: $");
        calc.findTotal();


        //Acessar os campos e métodos do objeto Calculator2
        //para encontrar o total para cada membro da festa de aniversário


        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */

    }
}