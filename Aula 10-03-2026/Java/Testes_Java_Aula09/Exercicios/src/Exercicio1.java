import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        //Lógica de aplicação do código TODO aqui
        String name = JOptionPane.showInputDialog("Digite seu nome");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        String dwelling = JOptionPane.showInputDialog("Digite um tipo de moradia");
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Digite um decimal entre 0 e 10"));
        String food = JOptionPane.showInputDialog("Digite um tipo de alimento");
        String animal = JOptionPane.showInputDialog("Qual é o seu animal favorito?");
        String bodyPart = JOptionPane.showInputDialog("Digite uma parte do corpo");
        String condition = JOptionPane.showInputDialog("Digite uma condição médica");
        String drink = JOptionPane.showInputDialog("Digite um tipo de bebida");
        int duration = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 2 e 14"));
        JOptionPane.showMessageDialog(null,"Olá! "+name+" é "+age+" anos e mora em uma "+dwelling+ ".\n"
                +"Próximo ano "+name+" vai ser "+ (age+1) +" anos de idade."
                +" A loja mais próxima é "+ distance+" de casa, \n "
                +"então é uma viagem de ida e volta de "+(distance*2)+ " quilômetros para comprar "+food+"!\n"
                +name+" tem um "+animal+" para companhia na viagem.\n"
                +"Um dia, "+name+" desenvolveu um "+condition+" no "+bodyPart+".\n"
                +"O médico receitou "+drink+" todos os dias para "+duration+" dias!");
    }

}


