package com.example.cmputlab4;

public abstract class Shape {
    private Integer x;
    private Integer y;
<<<<<<< HEAD
    String color = "blue";
=======
    String color = "red";
>>>>>>> 88dd0fd4925c7085a6e504a4b32633ca9f833b4e
    public Shape(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public abstract double area();

    public abstract double perimeter();
}

