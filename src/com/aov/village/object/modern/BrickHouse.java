package com.aov.village.object.modern;

import com.aov.village.object.House;
import com.aov.village.object.VillageObject;

public class BrickHouse extends House {
    public BrickHouse() { super("Brick House", "Modern"); }

    private BrickHouse(BrickHouse other) {
        super("Brick House", "Modern");
        this.children.addAll(other.cloneChildren());
    }

    @Override public VillageObject deepClone() { return new BrickHouse(this); }
}
