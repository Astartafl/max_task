package sub;

public class Divide implements Calc {
    @Override
    public int calc(int a, int b) {
        return a / b;
    }

    @Override
    public double calc(double a, double b) {
        return a / b;
    }

    @Override
    public String calc(String a, String b) {
        throw new IllegalArgumentException("Not with strings!");
    }
}
