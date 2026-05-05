package Sec7_5;

public class Prisoner4 {

        //Fields
        private String name;
        private double height;
        private int sentence;
        private Cell cell;



        //Constructor
        public Prisoner4(String name, double height, int sentence, Cell cell){
            this.name = name;
            this.height = height;
            this.sentence = sentence;
            this.cell=cell;
        }

        //Methods
        public void think(){
            System.out.println("Eu terei mina vingança.");
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





}

