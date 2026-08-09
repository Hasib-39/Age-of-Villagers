package com.aov.village.builder.traditional;

import com.aov.village.builder.VillageObjectBuilder;
import com.aov.village.object.VillageObject;
import com.aov.village.object.traditional.BananaTree;
import com.aov.village.shape.Circle;
import com.aov.village.shape.Rectangle;
import com.aov.village.shape.Triangle;

public class BananaTreeBuilder implements VillageObjectBuilder {
    private BananaTree tree;

    @Override public void reset() { tree = new BananaTree(); }

    @Override public void buildFoundation() {
        tree.addShape(new Rectangle(0.3, 1.2, "Green-Trunk"));
    }

    @Override public void buildStructure() {
        tree.addShape(new Triangle(1.5, 0.6, "Green-Leaf"));
        tree.addShape(new Triangle(1.5, 0.6, "Green-Leaf"));
        tree.addShape(new Triangle(1.5, 0.6, "Green-Leaf"));
    }

    @Override public void buildDetails() {
        tree.addShape(new Circle(0.25, "Yellow-Banana-Bunch"));
    }

    @Override public VillageObject getResult() { return tree; }
}
