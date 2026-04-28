package Sec7_3;

public class Prisoner2 {

    //Fields
    public String name;
    public double height;
    public int sentence;

    //Constructor
    public Prisoner2(String nome, double altura, int sentencia) {
        this.name = nome;
        this.height = altura;
        this.sentence = sentencia;
    }


    //Methods
    public void think(){
        System.out.println("Eu terei minha vingança.");
    }

    public void showFields(){
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.sentence);
    }

}