package java.powerofnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Request {
    private int number;
    private int power;

    public int getNumber() {
        return number;
    }

    public int getPower() {
        return power;
    }

    public Request() throws IOException {
        request();
    }

    public void request() throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome, Powerofnumbershunter! " +
                "Here you can find values of positive integer power math operation " +
                "for positive integer number. \n" +
                "Input positive integers number and power coefficient over space, please:");
        String answer = br.readLine();
        String[] arrayStringsWithValues = answer.split(" ");
        number = Integer.parseInt(arrayStringsWithValues[0]);
        power = Integer.parseInt(arrayStringsWithValues[1]);

        br.close();
    }

    public static void answer (int number){
        System.out.println("Your answer is: " + number);
        System.out.println("Good luck!");
    }
}
