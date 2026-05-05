package Sec7_6;
import Sec7_6.Cell2;

public class PrisonTest_Student_7_6 {
    public static void main(String[] args){
        Cell2 cellA1= new Cell2("A1", false, "1234");
        Cell2 cellB1= new Cell2("B1", false, "2345");
        Cell2 cellC1 = new Cell2("C1", false, "3456");
        Cell2 cellD1 = new Cell2("D1", false, "4567");

        Prisoner5 bubba = new Prisoner5("Bubba", 2.08, 4, cellA1);


    }
}