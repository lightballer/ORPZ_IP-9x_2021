package com.company;

public class DecoratorHouse extends DecoratorBase{
    public DecoratorHouse(Graphics shape) {
        super("House with " + shape.name);
    }
}
