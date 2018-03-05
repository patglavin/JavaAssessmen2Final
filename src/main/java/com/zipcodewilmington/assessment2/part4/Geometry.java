package com.zipcodewilmington.assessment2.part4;

public class Geometry {
    int height;
    int width;
    int radius;

    public Geometry(int height, int width, int radius){
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    public int getArea(int height, int width){
        return height * width;
    }

    public double getArea(int radius){
        return radius * radius * 3.14;
    }
}
