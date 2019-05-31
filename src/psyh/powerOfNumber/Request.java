package psyh.powerOfNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Request {
    public static int[] values;
    public static String answer;
    public static String[] arrayStringsWithValues;

    public static int[] request() throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome, Powerofnumbershunter! " +
                "Here you can find values of positive integer power math operation " +
                "for positive integer number. \n" +
                "Input positive integers number and power coefficient over space, please:");
        answer = br.readLine();
        arrayStringsWithValues = answer.split(" ");
        values[0] = Integer.parseInt(arrayStringsWithValues[0]);
        values[1] = Integer.parseInt(arrayStringsWithValues[1]);

        br.close();
        return values;
    }

    public static void answer (int number){
        System.out.println("Your answer is: " + number);
        System.out.println("Good luck!");
    }
}
