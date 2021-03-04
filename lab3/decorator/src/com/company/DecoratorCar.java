package com.company;

public class DecoratorCar extends DecoratorBase{
    public DecoratorCar(Graphics shape) {
        super(shape, "Car with " + shape.getName());
    }
    public void ride() {
        System.out.println(this.getName() + " started riding.....");
    }
}
