package com.aov.village.shape;

/**
 * The uniform interface for every drawable element in the game -
 * both a single primitive shape (Rectangle, Circle, ...) and a
 * composite object made of many shapes (House, Tree, ...).
 * This is the "Component" role of the Composite Pattern.
 */
public interface Shape {
    String getName();
    double getArea();
    void draw(int indentLevel);

    /** Prototype Pattern hook: every shape must know how to copy itself. */
    Shape cloneShape();
}
