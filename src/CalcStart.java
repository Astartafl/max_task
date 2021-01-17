import sub.Calculator;

public class CalcStart {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.calculate("0.8", "2", 0));
        System.out.println(cal.calculate(8, 2, 1));
        System.out.println(cal.calculate(0.8, 2, 2));
        System.out.println(cal.calculate(0.8, 2, 3));


    }
}
