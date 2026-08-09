package com.aov.village.shape;

public class Triangle implements Shape {
    private final double base;
    private final double height;
    private final String color;

    public Triangle(double base, double height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    @Override public String getName() { return "Triangle"; }

    @Override public double getArea() { return 0.5 * base * height; }

    @Override public void draw(int indentLevel) {
        System.out.printf("%s- %s Triangle [base=%s, height=%s], area=%.2f%n",
                ShapeUtils.indent(indentLevel), color, base, height, getArea());
    }

    @Override public Shape cloneShape() { return new Triangle(base, height, color); }
}
