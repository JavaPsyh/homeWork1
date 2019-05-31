package psyh.powerOfNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOfNumber {

    public static int powerOfNumber(int[] values) {
        //I'd corrected condition: for positive integer only.
        // Because perfect Math.pow() implementation isn't goal of this task.
        int number = values[0];
        int power = values[1];
        int result = number;
        for (int i = 1; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
