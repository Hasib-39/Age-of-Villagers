package com.aov.village.shape;

public class Circle implements Shape {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override public String getName() { return "Circle"; }

    @Override public double getArea() { return Math.PI * radius * radius; }

    @Override public void draw(int indentLevel) {
        System.out.printf("%s- %s Circle [radius=%s], area=%.2f%n",
                ShapeUtils.indent(indentLevel), color, radius, getArea());
    }

    @Override public Shape cloneShape() { return new Circle(radius, color); }
}
