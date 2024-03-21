package com.company.shapes;
public class Circle{
    private int radius;
    public Circle(int radius) {
        this.radius=radius;
    }
    public double calculateArea(){
            final double PI = 3.14;
            double area = (double) ( PI* radius);
            System.out.println("the area of Circle is "+area);
            return area;
    }
}

