package com.aov.village.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * COMPOSITE PATTERN
 * ------------------
 * Represents any village object (House, Tree, WaterSource, ...) as a
 * collection of simple shapes, while still exposing the same Shape
 * interface (getArea/draw) as its individual parts. This lets client
 * code treat "one brick" and "a whole brick house" uniformly.
 */
public abstract class CompositeShape implements Shape {
    protected final String name;
    protected final List<Shape> children = new ArrayList<>();

    protected CompositeShape(String name) {
        this.name = name;
    }

    public void addShape(Shape shape) {
        children.add(shape);
    }

    public void removeShape(Shape shape) {
        children.remove(shape);
    }

    public List<Shape> getChildren() {
        return children;
    }

    @Override public String getName() { return name; }

    @Override public double getArea() {
        double total = 0;
        for (Shape s : children) total += s.getArea();
        return total;
    }

    @Override public void draw(int indentLevel) {
        System.out.printf("%s+ %s (total area=%.2f)%n", ShapeUtils.indent(indentLevel), name, getArea());
        for (Shape s : children) s.draw(indentLevel + 1);
    }

    /** PROTOTYPE PATTERN helper: deep-copies every child shape for cloning. */
    protected List<Shape> cloneChildren() {
        List<Shape> copy = new ArrayList<>();
        for (Shape s : children) copy.add(s.cloneShape());
        return copy;
    }
}
