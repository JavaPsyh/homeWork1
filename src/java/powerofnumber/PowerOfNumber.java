package java.powerofnumber;

public class PowerOfNumber {

    private int number;
    private int power;

    public PowerOfNumber(Request request) {
        this.number = request.getNumber();
        this.power = request.getPower();
    }

    public int powerOfNumber() {
        int result = number;
        for (int i = 1; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
