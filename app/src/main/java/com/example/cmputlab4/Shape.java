package com.example.cmputlab4;

public abstract class Shape {
    private Integer x;
    private Integer y;
    String color = "Cyan";

    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();

    public abstract double perimeter();
}

