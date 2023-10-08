package com.example.cmputlab4;

// Rectangle.java

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(int x, int y, double length, double breadth) {
        super(x, y);
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length= length;
    }

    public double  getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }


    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public double perimeter() {
        return 2*(length + breadth);
    }
}

