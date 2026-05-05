package Sec7_6;

import Sec7_6.Cell2;

public class Prisoner5 {
    //Fields
    private String name;
    private double height;
    private int sentence;
    private Cell2 cell;
    private static int prisonerCount=0;
    private int bookingNumber;


    //Constructor
    public Prisoner5(String name, double height, int sentence, Cell2 cell){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell=cell;

        prisonerCount++;

        this.bookingNumber=prisonerCount;
    }



    //Methods
    public void think(){
        System.out.println("Eu terei mina vingança.");
    }

    public void displayPrisonerCount(){
        System.out.println(prisonerCount);
        System.out.println(bookingNumber);
    }

    public void showFields(){
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.sentence);
        System.out.println(this.cell.getName());
        System.out.println(this.cell.getIsOpen());
    }

    public void showFields(boolean showThink){
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.sentence);
        System.out.println(this.cell.getName());
        System.out.println(this.cell.getIsOpen());

        if (showThink){
            think();
        }
    }

    //getter

    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }
    public int getSentence(){
        return sentence;
    }
    public Cell2 getCell(){
        return cell;
    }

    //setters
    public void setName(String name){
        this.name=name;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setSentence(int sentence){
        this.sentence=sentence;
    }
    public void setCell(Cell2 cell){
        this.cell = cell;
    }


}

