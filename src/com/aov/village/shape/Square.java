package com.aov.village.shape;

public class Square implements Shape {
    private final double side;
    private final String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override public String getName() { return "Square"; }

    @Override public double getArea() { return side * side; }

    @Override public void draw(int indentLevel) {
        System.out.printf("%s- %s Square [side=%s], area=%.2f%n",
                ShapeUtils.indent(indentLevel), color, side, getArea());
    }

    @Override public Shape cloneShape() { return new Square(side, color); }
}
