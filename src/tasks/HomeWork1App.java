package tasks; //It is hard feeling, but may be changes is well.

import tasks.power.of.number.PowerOfNumber;
import tasks.power.of.number.Request;
import tasks.rhombus.Rhombus;

import java.io.IOException;

public class HomeWork1App {
    public static void main(String[] args) throws IOException, NumberFormatException {
//      1.1
        System.out.println("Result of your rate for this football match is: " +
                FootballMatch.resultOfFootballMatch(3, 4, 3, 4));
//      1.2
        Rhombus.rhombusDrawer(tasks.rhombus.Request.request());
//      1.3
        Request request = new Request();
        int powerOfNumber = new PowerOfNumber(request.getNumber(), request.getPower()).powerOfNumber();
        Request.answer(powerOfNumber);
    }
}
