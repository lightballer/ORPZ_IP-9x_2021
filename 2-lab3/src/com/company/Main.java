package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(1, 1,1, 1);
        int[] coordinates1 = circle.get();
        System.out.println(Arrays.toString(coordinates1));

        Shape rectangle = new Rectangle(2, 2,2, 2);
        int[] coordinates2 = rectangle.get();
        System.out.println(Arrays.toString(coordinates2));
    }
}
