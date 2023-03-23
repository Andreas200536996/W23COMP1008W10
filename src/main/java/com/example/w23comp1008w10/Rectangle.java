package com.example.w23comp1008w10;

public class Rectangle {
    private double height, width;

    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("Height must be greater than 0.");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("Width must be greater than 0.");
    }

    public boolean isSquare() {
        return false;
    }

    public double getArea() {
        return width * height;
    }
}
