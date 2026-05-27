public class CategoriaPremios {

    //fields
    private String nomeCategoria;
    private int tiquetesNecessarios;
    private int quantidadeDisponivel;

    //Constructor
    public CategoriaPremios(String nomeCategoria, int tiquetesNecessarios, int quantidadeDisponivel){
        this.nomeCategoria= nomeCategoria;

        if(tiquetesNecessarios>0){
            this.tiquetesNecessarios=tiquetesNecessarios;
        }
        else{
            System.out.println("Valor inválido");
            this.tiquetesNecessarios = 1;
        }

        if(quantidadeDisponivel>=0){
            this.quantidadeDisponivel=quantidadeDisponivel;
        }
        else{
            System.out.println("Número Inválido");
            this.quantidadeDisponivel=0;
        }
    }

    //getters
    public String getNomeCategoria() {
        return this.nomeCategoria;
    }

    public int getTiquetesNecessarios(){
        return this.tiquetesNecessarios;
    }

    public int getQuantidadeDisponivel(){
        return this.quantidadeDisponivel;
    }

    //setters

    public void setQuantidadeDisponivel(int valor){
        if(valor<0){
            System.out.println("Valor Inválido!");
            return;
        }
            this.quantidadeDisponivel=valor;
    }

    public void setTiquetesNecessarios(int valor){
        if(valor<0){
            System.out.println("Valor Inválido!");
            return;
        }
        this.tiquetesNecessarios=valor;
    }

}
