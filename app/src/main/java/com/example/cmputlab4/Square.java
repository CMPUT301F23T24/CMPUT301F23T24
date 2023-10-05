package com.example.cmputlab4;

public class Square extends Shape {
    public Square(Integer x, Integer y) {
        super(x, y);
    }
    public double area() {
        return (double) x * y;
    }
    public double perimeter() {
        return (double) x * 4;
    }
}
