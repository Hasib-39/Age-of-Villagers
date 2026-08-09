package com.aov.village.builder.desert;

import com.aov.village.builder.VillageObjectBuilder;
import com.aov.village.object.VillageObject;
import com.aov.village.object.desert.CactusTree;
import com.aov.village.shape.Circle;
import com.aov.village.shape.Rectangle;

public class CactusTreeBuilder implements VillageObjectBuilder {
    private CactusTree tree;

    @Override public void reset() { tree = new CactusTree(); }

    @Override public void buildFoundation() {
        tree.addShape(new Circle(0.5, "Sand"));
    }

    @Override public void buildStructure() {
        tree.addShape(new Rectangle(0.6, 2.5, "Green-Cactus-Body"));
        tree.addShape(new Rectangle(0.3, 0.8, "Green-Cactus-Arm"));
    }

    @Override public void buildDetails() {
        tree.addShape(new Circle(0.1, "Pink-Flower"));
    }

    @Override public VillageObject getResult() { return tree; }
}
