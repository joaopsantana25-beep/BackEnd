package Sec7_5;

public class PrisonTest_Student_7_5 {
    public static void main(String[] args){
        Cell cell01 = new Cell("Cela 01",true,"1234");
        Prisoner4 bubba = new Prisoner4("Bubba", 2.08, 4, cell01);


        bubba.showFields(true);
        cell01.changeIsOpen("1234");

    }
}
