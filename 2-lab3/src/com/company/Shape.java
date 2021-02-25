package com.company;

abstract class Shape extends Graphics{

    public Shape(String name) {
        this.name = name;
        System.out.println(this.name + " created");
    }

}
