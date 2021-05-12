package ІП_94._03_Бокій_Артем_Едуардович.lab1;

public class Expression {
    private int a;
    private int b;
    private int n;
    private int m;
    private int C;

    public Expression(int a, int b, int n, int m, int C) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.m = m;
        this.C = C;
    }

    double calculate() {
        if (C >= a && C <= n) {
            throw new ArithmeticException();
        }
        double result = 0;
        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                result += (i + j) / (i - C);
            }
        }
        return result;
    }
}