package com.company;

abstract class Shape {
    int x1 = 0;
    int x2 = 0;
    int y1 = 0;
    int y2 = 0;
    String name;

    public Shape(int x1, int y1, int x2, int y2, String name) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.name = name;
        System.out.println(this.name + " created");
    }

    public int[] get() {
        int[] coordinates = {this.x1, this.y1, this.x2, this.y2};
        return coordinates;
    }

}
