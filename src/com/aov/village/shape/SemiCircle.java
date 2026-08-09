package com.aov.village.shape;

public class SemiCircle implements Shape {
    private final double radius;
    private final String color;

    public SemiCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override public String getName() { return "SemiCircle"; }

    @Override public double getArea() { return 0.5 * Math.PI * radius * radius; }

    @Override public void draw(int indentLevel) {
        System.out.printf("%s- %s SemiCircle [radius=%s], area=%.2f%n",
                ShapeUtils.indent(indentLevel), color, radius, getArea());
    }

    @Override public Shape cloneShape() { return new SemiCircle(radius, color); }
}
