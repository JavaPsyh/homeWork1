package psyh;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
//      1.1
        System.out.println("Result of your rate for this football match is: " +
                FootballMatch.resultOfFM(4,1, 7, 2 ));
//      1.2
        Rhombus.request();
        Rhombus.rhombusDrawer(Rhombus.number);
        System.out.println("\nGood job! Wish you great rhombuses!!!");
//      1.3
        PowerOfNumber.request();
    }
}
