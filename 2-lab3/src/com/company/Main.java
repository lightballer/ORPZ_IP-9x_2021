package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Graphics circle = new Circle();
        Graphics circleWindows = new DecoratorWindow((circle));
        Graphics house = new DecoratorHouse(circleWindows);
        Graphics circleWindowCar = new DecoratorCar(circleWindows);
        System.out.println();

        Shape rectangle = new Rectangle();
        Graphics rectangleWheels = new DecoratorWheels(rectangle);
        DecoratorCar car = new DecoratorCar(rectangleWheels);
        System.out.println();
        
        Graphics rectangleWindows = new DecoratorWindow((rectangle));
        car = new DecoratorCar(rectangleWindows);
        car.ride();
        System.out.println();

    }
}
