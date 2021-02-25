package com.company;

abstract public class DecoratorBase extends Graphics{
    public DecoratorBase(String name) {
        this.name = name;
        this.createName();
    }

    public void createName() {
        System.out.println("Decorator created: " + this.name);
    }
}
