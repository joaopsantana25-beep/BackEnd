package Atividade1.Item3_ControleDeCelulares;

public class Celular {

    //Campos
    private String marca;
    private int armazenamentoGB;

    //Construtores
    public Celular(String marca, int armazenamentoGB){
        this.marca = marca;
        this.armazenamentoGB= armazenamentoGB;
    }

    //Métodos
    public void mostrarInformacoes(){
        System.out.println("A marca do celular é "+marca+" e ele possui "+armazenamentoGB+"GB de armazenamento");
    }

    public void setArmazenamento(int armazenamentoGB){
        if(armazenamentoGB>0){
            this.armazenamentoGB=armazenamentoGB;
        }
        else{
            System.out.println("Armazenamento Inválido");
        }
    }

    public void setMarca(String Marca) {
        if (marca != null && !marca.isBlank()) {
            this.marca = Marca;
        }
        else{
            System.out.println("Marca Inválida");
        }
    }
}
