package com.company;

public class DecoratorHouse extends DecoratorBase{
    public DecoratorHouse(Graphics shape) {
        super(shape,"House with " + shape.getName());
    }
}
