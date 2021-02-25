package com.company;

public class DecoratorCar extends DecoratorBase{
    public DecoratorCar(Graphics shape) {
        super("Car with " + shape.name);
    }
    public void ride() {
        System.out.println(this.name + " started riding.....");
    }
}
