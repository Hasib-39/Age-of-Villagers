package com.aov.village.builder.modern;

import com.aov.village.builder.VillageObjectBuilder;
import com.aov.village.object.VillageObject;
import com.aov.village.object.modern.MangoTree;
import com.aov.village.shape.Circle;
import com.aov.village.shape.Rectangle;

public class MangoTreeBuilder implements VillageObjectBuilder {
    private MangoTree tree;

    @Override public void reset() { tree = new MangoTree(); }

    @Override public void buildFoundation() {
        tree.addShape(new Rectangle(0.5, 1.5, "Brown-Trunk"));
    }

    @Override public void buildStructure() {
        tree.addShape(new Circle(2.0, "Green-Foliage"));
    }

    @Override public void buildDetails() {
        tree.addShape(new Circle(0.15, "Orange-Mango"));
        tree.addShape(new Circle(0.15, "Orange-Mango"));
        tree.addShape(new Circle(0.15, "Orange-Mango"));
    }

    @Override public VillageObject getResult() { return tree; }
}
