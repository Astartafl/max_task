package sub;

public class Minus implements Calc {
    @Override
    public int calc(int a, int b) {
        return a - b;
    }

    @Override
    public double calc(double a, double b) {
        return a - b;
    }

    @Override
    public String calc(String a, String b) throws Exception{
        throw new IllegalArgumentException("No");
    }
}
