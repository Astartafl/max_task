import sub.Calculator;

public class CalcStart {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.calculate("a", "b", 0));
        System.out.println(cal.calculate("a", "b", 1));
        System.out.println(cal.calculate("a", "b", 2));
        System.out.println(cal.calculate("a", "b", 3));
    }
}
