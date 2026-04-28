package Sec7_4;

//Section 7, Lesson 4 Starter for Exercise 2 - Slide 14

public class Prisoner3 {
    //Fields
    public String name;
    public double height;
    public int sentence;

    //Constructor
    public Prisoner3(String name, double height, int sentence){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
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

    public void showFields(boolean showThink){
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.sentence);

        if (showThink){
            think();
        }
    }



}