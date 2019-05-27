package psyh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOfNumber {

    static int num;
    static int pow;
    static String answer;
    static String[] splt;

    public static void request() throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome, Powerofnumbershunter! " +
                "Here you can find values of power math operation for any number. \n" +
                "Input any number and power coefficient over space, please:");
        answer = br.readLine();
        splt = answer.split(" ");
        num = Integer.parseInt(splt[0]);
        pow = Integer.parseInt(splt[1]);

        System.out.println("Your answer is: " + powerOfNumber(num, pow));
        System.out.println("Good luck!");
        br.close();
    }

    private static int powerOfNumber(int n, int p) {
        int result = n;
        for (int i = 1; i < p; i++) {
            result *= n;
        }
        return result;
    }
}
