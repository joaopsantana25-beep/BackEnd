import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//Input04.class.getResourceAsStream("input04text.txt"));

        //Edit these lines to advance the scanner
        if (sc==null) {
            sc.nextLine();
            System.out.println(sc.nextLine());
        }


        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));

        int x = sc.nextInt();
        int y = sc.nextInt();
        //Store the next two numbers as xPosition and yPosition
        //Print these positions


        System.out.println("X: "+x      +", Y: "+y        );
        sc.close();
    }
}