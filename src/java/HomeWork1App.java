package java; //It is hard feeling, but may be changes is well.

import java.powerofnumber.PowerOfNumber;
import java.powerofnumber.Request;
import java.rhombus.Rhombus;

import java.io.IOException;

import static java.rhombus.Request.*;

public class HomeWork1App {
    public static void main(String[] args) throws IOException, NumberFormatException {
//      1.1
        System.out.println("Result of your rate for this football match is: " +
                FootballMatch.resultOfFootballMatch(3, 4, 3, 4));
//      1.2
        Rhombus.rhombusDrawer(request());
//      1.3
        Request.answer(new PowerOfNumber(new Request()).powerOfNumber());
    }
}
