import java.awt.Component;
import javax.swing.JOptionPane;

public class Prova {
    public static void main(String[] args) {

        //Input do nome da pessoa
        String name = JOptionPane.showInputDialog("Digite seu nome");

        //Input da idade da pessoa junto com as contas de quantos anos ela finha no ano passado
        // e quanto ela fará no próximo aniversário
        int age = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        int idade_passada = age-1;
        int idade_futura = age+1;

        //Input da casa da pessoa
        String dwelling = JOptionPane.showInputDialog("Digite um tipo de moradia");

        //Input da da distância da casa da pessoa até seu trabalho
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Digite um decimal entre 0 e 10"));

        //Input da comida favorita do usuário
        String food = JOptionPane.showInputDialog("Digite um tipo de alimento");

        //Input do animal favorito do usuario
        String animal = JOptionPane.showInputDialog("Qual é o seu animal favorito?");

        //Input do ano da compra do animal favorito do usuario
        int ano_compra_animal = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você comprou sua/seu "+animal+" ?"));

        //Preço que o usuario pagou pelo animal de estimação
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite um decimal entre 0 e 10"))*5000;

        //Input da parte do corpo que foi mordida
        String bodyPart = JOptionPane.showInputDialog("Digite uma parte do corpo");

        //Input do animal que mordeu o usuario
        String animal_venenoso = JOptionPane.showInputDialog("Digite um animal");

        //Tempo que o animal demorou para morrer
        int duration = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 2 e 14"));

        JOptionPane.showMessageDialog((Component)null, "Olá! " + name + " tem " + age +
                " anos atualmente, se formou quando tinha "+idade_passada+" anos e fará "+idade_futura+" no próximo aniversário. " +
                "Mora em uma " + dwelling + " alugado mas seu sonho era morar em Xique-Xique Bahia.\nA distância de sua moradia até seu trabalho é " + distance +
                " km então é uma viagem de ida e volta de de "+distance*3+" km(Você deve contar o tempo no transporte, parece uma viagem extra!)  para comprar " + food + "!" +
                "\n" + name + " tem um/a " + animal + " que comprou em "+ano_compra_animal+ " pela bagatela de " +
                "R$ "+ preco+" reais, ou $10,00 dólares, para ser sua companhia de viagem. Um dia, " + name + " foi mordido por um/a " + animal_venenoso+ " venenosa na/o " + bodyPart +
                ".\nMas depois de " + duration + " dias agonizantes a/o " + animal_venenoso + " morreu!");
    }
}
