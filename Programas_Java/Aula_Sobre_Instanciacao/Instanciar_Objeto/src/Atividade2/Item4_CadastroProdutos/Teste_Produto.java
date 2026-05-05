package Atividade2.Item4_CadastroProdutos;

public class Teste_Produto {
    public static void main(String[] args){
        Produto notebook = new Produto("Notebook",3000);
        Produto mouse = new Produto("Mouse",100);

        notebook.mostrarInformacoes();

        //Desconto de 10%
        notebook.setPreco((notebook.getPreco()*0.90));

         notebook.mostrarInformacoes();
    }
}
