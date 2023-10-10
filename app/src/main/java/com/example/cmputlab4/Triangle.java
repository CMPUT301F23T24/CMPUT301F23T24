package com.example.cmputlab4;

public class Triangle extends Shape{
    private int side_a;


    private int side_b;

    private int side_c;
    private int height;

    public Triangle(Integer x, Integer y,int side_c , int height , int side_a , int side_b) {
        super(x, y);
        this.side_c = side_c;
        this.side_a = side_a;
        this.side_b = side_b;
        this.height = height;

    }

    public int getSide_a() {
        return side_a;
    }

    public void setSide_a(int side_a) {
        this.side_a = side_a;
    }

    public int getSide_b() {
        return side_b;
    }

    public void setSide_b(int side_b) {
        this.side_b = side_b;
    }

    public int getSide_c() {
        return side_c;
    }

    public void setSide_c(int side_c) {
        this.side_c = side_c;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5*side_c*height;
    }

    @Override
    public double perimeter() {
        return side_c + side_a + side_b;
    }
}
