package com.aov.village.shape;

public class Rectangle implements Shape {
    private final double width;
    private final double height;
    private final String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override public String getName() { return "Rectangle"; }

    @Override public double getArea() { return width * height; }

    @Override public void draw(int indentLevel) {
        System.out.printf("%s- %s Rectangle [%sx%s], area=%.2f%n",
                ShapeUtils.indent(indentLevel), color, width, height, getArea());
    }

    @Override public Shape cloneShape() { return new Rectangle(width, height, color); }
}
