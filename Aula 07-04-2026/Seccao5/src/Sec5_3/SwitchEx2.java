package Sec5_3;

import java.util.Scanner;

public class SwitchEx2 {

    public static void main(String[] args) {
        char option = 'A';
        int aCount = 0, bCount = 0, cCount = 0;

        switch (option) {
            case 'A':
                aCount++;
                System.out.println("Conte de A  " + aCount);

            case 'B':
                bCount++;
                System.out.println("Conte de B  " + bCount);

            case 'C':
                cCount++;
                System.out.println("Conte de C  " + cCount);
                break;

        }
    }
}

