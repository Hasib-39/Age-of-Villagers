package com.aov.village.builder.traditional;

import com.aov.village.builder.VillageObjectBuilder;
import com.aov.village.object.VillageObject;
import com.aov.village.object.traditional.Pond;
import com.aov.village.shape.Circle;
import com.aov.village.shape.SemiCircle;

public class PondBuilder implements VillageObjectBuilder {
    private Pond pond;

    @Override public void reset() { pond = new Pond(); }

    @Override public void buildFoundation() {
        pond.addShape(new Circle(3, "Brown-Mud-Edge"));
    }

    @Override public void buildStructure() {
        pond.addShape(new Circle(2.5, "Blue-Water"));
    }

    @Override public void buildDetails() {
        pond.addShape(new SemiCircle(1, "Green-Reeds"));
    }

    @Override public VillageObject getResult() { return pond; }
}
