package Atividade2.Item2_Temperatura;

public class Termostato {
    //campos
    private String comodo;
    private double temperatura;

    //construtores
    public Termostato(String comodo,double temperatura){
        this.comodo = comodo;
        this.temperatura = temperatura;
    }

    //Métodos
    public void mostrarTemperatura(){
        System.out.printf("A temperatura do ambiente é: %.2fºC",temperatura);
    }

    public double getTemperatura(){
        return this.temperatura;
    }

    public String getComodo(){
        return this.comodo;
    }
}
