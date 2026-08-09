package com.aov.village.object.desert;

import com.aov.village.object.VillageObject;
import com.aov.village.object.WaterSource;

public class Oasis extends WaterSource {
    public Oasis() { super("Oasis", "Desert"); }

    private Oasis(Oasis other) {
        super("Oasis", "Desert");
        this.children.addAll(other.cloneChildren());
    }

    @Override public VillageObject deepClone() { return new Oasis(this); }
}
