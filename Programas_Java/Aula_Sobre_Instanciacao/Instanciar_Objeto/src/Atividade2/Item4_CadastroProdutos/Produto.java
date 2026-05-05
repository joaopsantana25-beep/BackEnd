package Atividade2.Item4_CadastroProdutos;

public class Produto {
    //Campos
    private String nome;
    private double preco;


    //Construtores
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Métodos
    public void mostrarInformacoes(){
        System.out.printf("O nome do produto é %s" +
                "e ele custa R$%.2f \n",this.nome,this.preco);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            System.out.println("Nome Inválido");
        }
    }

    public void setPreco(double preco){
        if(preco>=0){
            this.preco = preco;
        }
        else{
            System.out.println("Preço Inválido");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }
}
