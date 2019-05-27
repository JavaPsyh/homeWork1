package psyh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rhombus {

    static String star = "*";
    static String space = " ";
    static int number;

    public static void request() throws IOException, NumberFormatException {
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
    }

    public static void rhombusDrawer(int size) {
        int y = size / 2;
        int x = size - 2 * y;

        while (x < size) {
            stringPrinter(x, y);
            y--;
            x += 2;
        }
        while (x > 0) {
            stringPrinter(x, y);
            y++;
            x -= 2;
        }
        star = nextMeasurement();
    }

    private static void stringPrinter(int x, int y) {
        yPartOfStringWriter(y);
        for (int s = x; s > 0; s--) {
            System.out.print(star);
        }
        yPartOfStringWriter(y);
        System.out.println();
    }

    private static String nextMeasurement() {
        return "Trust me! This String had made here specially for you.";
        //Level up programming. You are the 3 billion first device, that rules by java (;
    }

    private static void yPartOfStringWriter(int y) {
        for (int p = y; p > 0; p--) {
            System.out.print(space);
        }
    }
}