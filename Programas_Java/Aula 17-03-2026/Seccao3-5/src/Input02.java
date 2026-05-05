import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "Isso não é uma mensagem!",
                "Não há nenhuma mensagem aqui",
                1);


        String input1 = (String)JOptionPane.showInputDialog(null,
                "Isso é uma pergunta?",
                "Talvez seja uma pergunta?",
                3,
                null,
                null,
                "");


        String[] acceptableValues = {"Sim", "Não", "Talvez"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Isso é uma pergunta?",
                "Caixa de multipla escolha",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);

    }
}