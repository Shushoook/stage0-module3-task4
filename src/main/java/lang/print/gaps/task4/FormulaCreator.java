package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double y = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
        System.out.println(y);
    }
}
