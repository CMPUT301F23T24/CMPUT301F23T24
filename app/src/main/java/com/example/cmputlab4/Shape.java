package com.example.cmputlab4;

public abstract class Shape {
    protected String color = "blue";
    private Integer x;
    private Integer y;

    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();

    public abstract double perimeter();
}

