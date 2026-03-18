import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Crie um JOptionPane.
        //Armazene a entrada como uma String e imprima-a.

        String numero = JOptionPane.showInputDialog("Digite um numero");
        System.out.println(numero);


        //Analise a entrada como um int.
        //Imprima seu valor +1

        int Intnumero = Integer.parseInt(numero);
        System.out.println(Intnumero+1);



        //Tente criar um diálogo, analisá-lo e inicializar um int em uma única linha.
        //Você deve ter apenas um ponto e vírgula (;) nesta linha.

        int var = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        System.out.print(var);


    }
}