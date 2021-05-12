package ІП_94._03_Бокій_Артем_Едуардович.lab1;

public class Main {
    public static void main(String[] args) {
        final int studentBookNumber = 9403;
        // C2 = 1
        // C3 = 1
        // C5 = 3
        // C7 = 2
        // O1 = -
        // O2 = +
        // typeof i and j = int
        int a = 2;
        int b = 10;
        int n = 2;
        int m = 15;
        int C = 1;

        Expression expression = new Expression(a, b, n, m, C);
        try {
            double result = expression.calculate();
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.out.println("Error was occurred: division by zero");
        }
    }
}
