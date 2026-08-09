package com.aov.village.builder.desert;

import com.aov.village.builder.VillageObjectBuilder;
import com.aov.village.object.VillageObject;
import com.aov.village.object.desert.Oasis;
import com.aov.village.shape.Circle;

public class OasisBuilder implements VillageObjectBuilder {
    private Oasis oasis;

    @Override public void reset() { oasis = new Oasis(); }

    @Override public void buildFoundation() {
        oasis.addShape(new Circle(4, "Sand-Edge"));
    }

    @Override public void buildStructure() {
        oasis.addShape(new Circle(3, "Blue-Water"));
    }

    @Override public void buildDetails() {
        oasis.addShape(new Circle(0.2, "Green-Palm-Leaf"));
        oasis.addShape(new Circle(0.2, "Green-Palm-Leaf"));
    }

    @Override public VillageObject getResult() { return oasis; }
}
