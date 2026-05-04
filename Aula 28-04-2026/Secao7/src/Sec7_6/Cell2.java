package Sec7_6;

public class Cell2 {

    //Fields
    private String name;
    private String codigoSeguranca;
    private boolean isOpen;


    //Constructor
    public Cell2(String name, boolean isOpen, String codigoSeguranca){
        this.name = name;
        this.isOpen = isOpen;
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getName(){
        return this.name;
    }

    public boolean getIsOpen(){
        return this.isOpen;
    }

    public void setName(String name){
        this.name=name;
    }

    public void changeIsOpen(String codigoSeguranca){
        if(codigoSeguranca.equals(this.codigoSeguranca)) {
            this.isOpen = (!this.isOpen);

            if(this.isOpen){
                System.out.println("A porta está aberta agora!");
            }
            else{
                System.out.println("A porta está fechada agora!");
            }
        }
        else{
            System.out.println("Código de segurança inválido");
        }
    }




}
