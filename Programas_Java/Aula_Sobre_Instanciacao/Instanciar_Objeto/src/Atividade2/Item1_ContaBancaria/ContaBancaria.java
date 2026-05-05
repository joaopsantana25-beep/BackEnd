package Atividade2.Item1_ContaBancaria;

public class ContaBancaria {

    //Campos
    private String titular;
    private double saldo;


    //Construtores
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //Métodos
    public void mostrarConta(){
        System.out.printf("O nome do titular da conta é %s e o saldo é R$%.2f \n",this.titular,this.saldo);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setSaldo(double saldo){
        if(saldo>=0){
            this.saldo=saldo;
        }
        else{
            System.out.println("Saldo Inválido");
        }
    }

    public void setTitular(String titular){
        if(titular!=null && !titular.isBlank()){
            this.titular=titular;
        }
        else{
            System.out.println("Nome inválido");
        }
    }


}
