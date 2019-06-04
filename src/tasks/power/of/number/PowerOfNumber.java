package tasks.power.of.number;

public class PowerOfNumber {

    private int number;
    private int power;

    public PowerOfNumber(int number, int power) {
        this.number = number;
        this.power = power;
    }

    public int powerOfNumber() {
        int result = number;
        for (int i = 1; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
