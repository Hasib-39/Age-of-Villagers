package com.aov.village.object.traditional;

import com.aov.village.object.VillageObject;
import com.aov.village.object.WaterSource;

public class Pond extends WaterSource {
    public Pond() { super("Pond", "Traditional"); }

    private Pond(Pond other) {
        super("Pond", "Traditional");
        this.children.addAll(other.cloneChildren());
    }

    @Override public VillageObject deepClone() { return new Pond(this); }
}
