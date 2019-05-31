package psyh.rhombus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Request {

    public static int number;

    public static int request() throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome, Rhombushunter! Here you can find your best rhombus. \n" +
                "For true rhombusmaking we need, as you know, not even side of rhombus area. \n" +
                "So, input any odd number, please:");
        number = Integer.parseInt(br.readLine());

        while (number % 2 == 0) {
            System.out.println("May be you don't understand, junior Rhombushunter." +
                    " It can be ODD number only. Try again:");
            number = Integer.parseInt(br.readLine());
        }
        br.close();
        return number;
    }
}
