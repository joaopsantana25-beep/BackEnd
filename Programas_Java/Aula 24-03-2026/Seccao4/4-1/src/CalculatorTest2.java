
public class CalculatorTest2 {
    public static void main(String[] args) {
        //Instanciar um objeto Calculator2
        Calculator2 calc = new Calculator2();


        calc.findTotal(10.00,"Pessoa 1");

        calc.findTotal(12.00,"Pessoa 2");

        calc.findTotal(9.00,"Pessoa 3");

        calc.findTotal(8.00,"Pessoa 4");

        calc.findTotal(7.00,"Pessoa 5");

        calc.findTotal(15.00,"Pessoa 6");

        calc.findTotal(11.00,"Pessoa 7");

        calc.findTotal(30.00,"Pessoa 8");


        //Acessar os campos e métodos do objeto Calculator2
        //para encontrar o total para cada membro da festa de aniversário
        calc.mostrar_total();

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