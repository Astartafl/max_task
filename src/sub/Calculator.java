package sub;

public class Calculator {
    Calc[] operation = {new Plus(), new Minus(), new Mult(), new Divide()};
    public int calculate(int a, int b, int i){
        return operation[i].calc(a, b);
    }
    public double calculate(double a, double b, int i){
        return operation[i].calc(a, b);
    }
    public String calculate(String a, String b, int i){
        return operation[i].calc(a, b);
    }

}
